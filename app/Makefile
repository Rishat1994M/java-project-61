run-dist:
	./build/install/app/bin/app

up: 
	cp -n .env.example .env
	touch database/database.sqlite
	composer install
	npm install
	php artisan key:generate
	php artisan migrate --seed
	heroku local -f Procfile.dev
	
install:
	composer install
	npm install
build: dependencies
    	./gradlew build

test: dependencies
    	./gradlew test
