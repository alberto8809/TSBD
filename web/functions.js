/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$( document ).ready(function() {
   
   
   $("table").hide();
   
   
   
   $(function() {
 $(document).on('click', 'select', function(event) {
    let id = this.id;
   $("table").show(); 
    let value= $(this).val();
       $.post("option.jsp", { value: value }, function(data){
          
         $("#body").html(data);
         
        
        });
  });
});

});
