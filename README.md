# Projeto de Testes Automatizados E2E com Selenium e Cucumber

Este projeto realiza testes automatizados end-to-end (E2E) usando **Java**, **JUnit**, **Selenium WebDriver** e **Cucumber**. O fluxo automatizado cobre login, navegação até a home e processo de checkout.

## ✅ Tecnologias utilizadas Frameworks

- Java 11+
- Maven
- Selenium WebDriver
- Cucumber
- JUnit
- Relatórios HTML e JSON
- Captura automática de screenshots em caso de falha

##  Estruturação do Projeto

- `Pages/`: Páginas com mapeamento de elementos (Page Object)
- `Steps/`: Definições dos passos (step definitions)
- `Runners/`: Runner com anotação `@CucumberOptions`
- `Utils/`: Classe `Hooks` com configuração de setup/teardown e screenshot
- `features/`: Cenários BDD em Gherkin (`.feature`)

##  Como executar os testes

```bash
mvn clean test
```

Isso irá:
- Executar os testes
- Gerar relatórios HTML e JSON em `target/cucumber-reports/`
- Capturar screenshots de cenários que falharem (em `target/screenshots/`)

##  Como gerar relatório avançado com gráficos

Certifique-se de que seu `pom.xml` contém o plugin `maven-cucumber-reporting`. Após a execução, rode:

```bash
mvn verify
```

Será gerado:

```
target/cucumber-html-reports/index.html
```

##  Funcionalidades cobertas

- Login na aplicação
- Acesso à página inicial
- Execução de uma compra com finalização
- Validação de fluxos com diferentes entradas
- Geração de relatório com evidências

##  Evidência de falhas

Caso um cenário falhe, um screenshot será salvo em:

```
target/screenshots/NOME_DO_CENARIO.png
```

E também poderá ser incluído no relatório do Cucumber, se suportado.

---

Desenvolvido para fins de avaliação de automação de testes E2E.