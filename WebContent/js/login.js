Ext.onReady(function(){  
    		Ext.QuickTips.init();  
      
    var loginForm=new Ext.FormPanel({  
        standardSubmit: true,   
        url:'login',  
        renderTo:document.body,  
        frame:true,  
        title:'用户登陆',  
        width:400, 
        x:'50%',
        y:100,
        items:[  
            {  
                xtype:'textfield',  
                fieldLabel:' 用户名 ',  
                name:'name',  
                width:180 
                  
                 
                  /*allowBlank:false,  
                blankText:'用户名不能为空',  
                minLength:6,  
                minLengthText:'用户名的长度为[6-20]',  
                maxLength:20,  
                maxLengthText:'用户名的长度为[6-20]' */
            },  
            {  
                xtype: 'textfield',     
                inputType:'password',   
                fieldLabel:'密 &nbsp; &nbsp;码',  
                name:'pwd',  
                width:180 
                  
                /*allowBlank:false,  
                blankText:'密码不能为空',  
                minLength:6,  
                minLengthText:'密码的长度为[6-20]',  
                maxLength:20,  
                maxLengthText:'密码的长度为[6-20]' */ 
            }
        ],  
        buttons: [  
            {   
                text: '登录',   
                type:'button',  
                handler:function(){  
                    if (!loginForm.getForm().isValid()) return;  
                      
                    loginForm.getForm().submit();  
  
                }    
            }  
        ]  
          
    });  
}  
);