@GetMapping("/amedigital")
    String salvar (@RequestBody Account account) {

        if (account.active) {

            if (account.balance > 0) {

                if (account.user.active()) {

 
                        // Implrimindo saldo
                        System.out.println("- Balance: " + account.balance );

                        // Depositando 10
                        account.balance = account.balance + 10;

                        // Salvando conta
                        repositorio.save(account);


                        // Implrimindo saldo
                        System.out.println("- Balance: " + account.balance );
                }


            } else {
                System.out.println("Não tem saldo inicial");
            }
        } else {
            System.out.println("Conta não está ativa");
        }
        return "Teste";
    }