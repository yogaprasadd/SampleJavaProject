Install docker in local server

apt-get update
apt-get install -y docker.io
sudo systemctl start docker
sudo systemctl enable docker
docker --version

Add Jenkins User to Docker Group
sudo usermod -aG docker jenkins
sudo systemctl restart jenkins
sudo -u jenkins docker ps

