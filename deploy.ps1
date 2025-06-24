# deploy.ps1
# Setup Minikube Docker
& minikube -p minikube docker-env --shell powershell | Invoke-Expression

Write-Host "=== Building Docker Image ==="
docker build -t springboot-app:latest .

Write-Host "=== Applying Kubernetes Deployment ==="
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml

Write-Host "=== Waiting for Rollout ==="
kubectl rollout status deployment/springboot-app
