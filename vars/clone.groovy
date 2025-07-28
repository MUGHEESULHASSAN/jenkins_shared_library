def call(String url,String branch1){
  echo '📦 Cloning Django app...'
  git branch: "${branch}", url: "${url}"
  echo "code clonning successfully"
}
