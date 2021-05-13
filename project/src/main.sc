theme: /

    state: newNode_0
        a:  Тілді таңдаңыз/ Выберите язык:\n
            0 - Қазақ\n
            1 - Русский
        go!: /newNode_1
    @IntentGroup
        {
          "boundsTo" : "/newNode_0",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_1
        state: 1
            intent: /newNode_1/1

            go!: /newNode_148

        state: 2
            intent: /newNode_1/2

            go!: /newNode_2

        state: Fallback
            event: noMatch
            go!: /newNode_91
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_1",
                name: "newNode_1 buttons",
                handler: function($context) {
                }
            });

    state: newNode_2
        a:  Привет! \n
            Это чат бот Digital Agent, который позволит вам оценить любое государственное учреждение нашей страны. \n
            Не понравилось, как вас обслужили? Digital Agent решит вашу проблему, просто оставьте свой отзыв и сотрудники данной организации обязательно свяжутся с Вами для решения возникшей проблемы.\n
            100% пользователей получают обратную связь и меняют систему к лучшему.
        script:
            $reactions.timeout({interval: _.template('3 seconds', {variable: '$session'})($session), targetState: '/newNode_4'});
        go!: /newNode_97
    @IntentGroup
        {
          "boundsTo" : "/newNode_2",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_97
        state: Fallback
            event: noMatch
            go!: /newNode_4
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_97",
                name: "newNode_97 buttons",
                handler: function($context) {
                }
            });

    state: newNode_91
        a:  Қайта теріп көріңіз!\n
            Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_0'});
        go!: /newNode_94
    @IntentGroup
        {
          "boundsTo" : "/newNode_91",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_94
        state: Fallback
            event: noMatch
            go!: /newNode_0
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_94",
                name: "newNode_94 buttons",
                handler: function($context) {
                }
            });

    state: newNode_148
        a:  Сәлем!\n
            Бұл біздің елдегі кез-келген мемлекеттік мекемені бағалауға мүмкіндік беретін Digital Agent чат-боты.\n
            Сізге қызмет көрсету түрі ұнамады ма? Digital Agent сіздің мәселеңізді шешеді, тек өз пікіріңізді қалдырыңыз, мәселеңізді шешу үшін осы ұйымның қызметкерлері сізге міндетті түрде хабарласады.\n
            Пайдаланушылардың 100% кері байланыс алады және жүйені жақсы жаққа өзгертуге үлес қосады.
        script:
            $reactions.timeout({interval: _.template('3 seconds', {variable: '$session'})($session), targetState: '/newNode_149'});
        go!: /newNode_150
    @IntentGroup
        {
          "boundsTo" : "/newNode_148",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_150
        state: Fallback
            event: noMatch
            go!: /newNode_149
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_150",
                name: "newNode_150 buttons",
                handler: function($context) {
                }
            });

    state: newNode_4
        a:  Вы хотите оставить отзыв?\n
            0 - Нет\n
            1 - Да\n
            Введите + чтобы вернуться в меню
        go!: /newNode_5
    @IntentGroup
        {
          "boundsTo" : "/newNode_4",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_5
        state: 1
            intent: /newNode_5/1

            go!: /newNode_121

        state: 2
            intent: /newNode_5/2

            go!: /newNode_6

        state: 3
            intent: /newNode_5/3

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_92
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_5",
                name: "newNode_5 buttons",
                handler: function($context) {
                }
            });

    state: newNode_149
        a:  Пікір қалдырғыңыз келеді ме?\n
            0 - Жоқ\n
            1 - Иә\n
            Мәзірге оралу үшін + енгізіңіз
        go!: /newNode_151
    @IntentGroup
        {
          "boundsTo" : "/newNode_149",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_151
        state: 1
            intent: /newNode_151/1

            go!: /newNode_152

        state: 2
            intent: /newNode_151/2

            go!: /newNode_156

        state: 3
            intent: /newNode_151/3

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_157
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_151",
                name: "newNode_151 buttons",
                handler: function($context) {
                }
            });

    state: newNode_6
        HttpRequest:
            url = https://api2.digitalagent.kz/api/service-provider-types/all
            method = GET
            body = 
            okState = /newNode_7
            errorState = /newNode_93
            timeout = 0
            headers = []
            vars = [{"name":"spt","value":"$httpResponse.serviceProviderTypes"}]

    state: newNode_92
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_4'});
        go!: /newNode_95
    @IntentGroup
        {
          "boundsTo" : "/newNode_92",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_95
        state: Fallback
            event: noMatch
            go!: /newNode_4
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_95",
                name: "newNode_95 buttons",
                handler: function($context) {
                }
            });

    state: newNode_121
        a: Введите + чтобы вернуться в меню
        go!: /newNode_122
    @IntentGroup
        {
          "boundsTo" : "/newNode_121",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_122
        state: 1
            intent: /newNode_122/1

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_129
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_122",
                name: "newNode_122 buttons",
                handler: function($context) {
                }
            });

    state: newNode_152
        a: Мәзірге оралу үшін + енгізіңіз
        go!: /newNode_153
    @IntentGroup
        {
          "boundsTo" : "/newNode_152",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_153
        state: 1
            intent: /newNode_153/1

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_154
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_153",
                name: "newNode_153 buttons",
                handler: function($context) {
                }
            });

    state: newNode_157
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_149'});
        go!: /newNode_158
    @IntentGroup
        {
          "boundsTo" : "/newNode_157",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_158
        state: Fallback
            event: noMatch
            go!: /newNode_149
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_158",
                name: "newNode_158 buttons",
                handler: function($context) {
                }
            });

    state: newNode_156
        HttpRequest:
            url = https://api2.digitalagent.kz/api/service-provider-types/all
            method = GET
            body = 
            okState = /newNode_159
            errorState = /newNode_160
            timeout = 0
            headers = []
            vars = [{"name":"sptKz","value":"$httpResponse.serviceProviderTypes"}]

    state: newNode_7
        if: $session.spt_list = [], $session.spt_num = 0
            go!: /newNode_8
        else:
            go!: /newNode_8

    state: newNode_93
        a:  Ошибка 1: {{$session.httpStatus}}\n
            Ответ 1: {{$session.httpResponse}}\n
            Введите - чтобы вернуться назад\n
            Введите + чтобы вернуться в меню
        go!: /newNode_123
    @IntentGroup
        {
          "boundsTo" : "/newNode_93",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_123
        state: 1
            intent: /newNode_123/1

            go!: /newNode_2

        state: 2
            intent: /newNode_123/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_130
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_123",
                name: "newNode_123 buttons",
                handler: function($context) {
                }
            });

    state: newNode_129
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_121'});
        go!: /newNode_131
    @IntentGroup
        {
          "boundsTo" : "/newNode_129",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_131
        state: Fallback
            event: noMatch
            go!: /newNode_121
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_131",
                name: "newNode_131 buttons",
                handler: function($context) {
                }
            });

    state: newNode_154
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_152'});
        go!: /newNode_155
    @IntentGroup
        {
          "boundsTo" : "/newNode_154",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_155
        state: Fallback
            event: noMatch
            go!: /newNode_152
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_155",
                name: "newNode_155 buttons",
                handler: function($context) {
                }
            });

    state: newNode_159
        if: $session.sptKz_list = [], $session.sptKz_num = 0
            go!: /newNode_162
        else:
            go!: /newNode_162

    state: newNode_160
        a:  Қате 1: {{$session.httpStatus}}\n
            Жауап 1: {{$session.httpResponse}}\n
            Кері оралу үшін - енгізіңіз\n
            Мәзірге оралу үшін + енгізіңіз
        go!: /newNode_161
    @IntentGroup
        {
          "boundsTo" : "/newNode_160",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_161
        state: 1
            intent: /newNode_161/1

            go!: /newNode_148

        state: 2
            intent: /newNode_161/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_164
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_161",
                name: "newNode_161 buttons",
                handler: function($context) {
                }
            });

    state: newNode_8
        if: $session.spt.first()
            go!: /newNode_11
        else:
            go!: /newNode_17

    state: newNode_130
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_93'});
        go!: /newNode_132
    @IntentGroup
        {
          "boundsTo" : "/newNode_130",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_132
        state: Fallback
            event: noMatch
            go!: /newNode_93
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_132",
                name: "newNode_132 buttons",
                handler: function($context) {
                }
            });

    state: newNode_162
        if: $session.sptKz.first()
            go!: /newNode_163

    state: newNode_164
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_160'});
        go!: /newNode_165
    @IntentGroup
        {
          "boundsTo" : "/newNode_164",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_165
        state: Fallback
            event: noMatch
            go!: /newNode_160
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_165",
                name: "newNode_165 buttons",
                handler: function($context) {
                }
            });

    state: newNode_11
        if: $session.spt_str = "\n" +  $session.spt_num + " - " +  $session.spt.current().nameRu + "\n"
            go!: /newNode_12

    state: newNode_163
        if: $session.sptKz_str = "\n" +  $session.sptKz_num + " - " +  $session.sptKz.current().nameKz + "\n"
            go!: /newNode_166

    state: newNode_12
        if: $session.spt_list.push($session.spt_str)
            go!: /newNode_13

    state: newNode_166
        if: $session.sptKz_list.push($session.sptKz_str)
            go!: /newNode_167

    state: newNode_13
        if: $session.spt.next()
            go!: /newNode_14
        else:
            go!: /newNode_16

    state: newNode_167
        if: $session.sptKz.next()
            go!: /newNode_168
        else:
            go!: /newNode_169

    state: newNode_14
        if: $session.spt_num = $session.spt_num + 1
            go!: /newNode_11
        else:
            go!: /newNode_17

    state: newNode_16
        if: $session.spt_list = String($session.spt_list).replace(/,/g, "")
            go!: /newNode_17

    state: newNode_168
        if: $session.sptKz_num = $session.sptKz_num + 1
            go!: /newNode_163
        else:
            go!: /newNode_170

    state: newNode_169
        if: $session.sptKz_list = String($session.sptKz_list).replace(/,/g, "")
            go!: /newNode_170

    state: newNode_281
        script:
            $reactions.timeout({interval: _.template('10 seconds', {variable: '$session'})($session), targetState: '/newNode_285'});
        go!: /newNode_282

    state: newNode_282
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = {{$session.spt_list}}
            varName = spt_sel_id
            htmlEnabled = false
            then = /newNode_19

    state: newNode_17
        a:  Выберите пожалуйста тип услугодателя:\n
            Введите число от 0 до {{$session.spt_num}} \n
            Введите - чтобы вернуться назад\n
            Введите + чтобы вернуться в меню
        script:
            $reactions.timeout({interval: _.template('2 seconds', {variable: '$session'})($session), targetState: '/newNode_281'});
        go!: /newNode_98
    @IntentGroup
        {
          "boundsTo" : "/newNode_17",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_98
        state: Fallback
            event: noMatch
            go!: /newNode_281
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_98",
                name: "newNode_98 buttons",
                handler: function($context) {
                }
            });

    state: newNode_170
        a:  Қызмет көрсетушінің түрін таңдаңыз:\n
            0 мен {{$session.sptKz_num}} аралығындағы санды енгізіңіз\n
            Кері оралу үшін - енгізіңіз\n
            Мәзірге оралу үшін + енгізіңіз
        script:
            $reactions.timeout({interval: _.template('2 seconds', {variable: '$session'})($session), targetState: '/newNode_171'});
        go!: /newNode_172
    @IntentGroup
        {
          "boundsTo" : "/newNode_170",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_172
        state: Fallback
            event: noMatch
            go!: /newNode_171
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_172",
                name: "newNode_172 buttons",
                handler: function($context) {
                }
            });

    state: newNode_19
        if: $session.spt_sel_id === "-"
            go!: /newNode_2
        elseif: $session.spt_sel_id === "+"
            go!: /newNode_0
        elseif: $session.spt_sel_id >= 0 && $session.spt_sel_id <= $session.spt_num
            go!: /newNode_21
        else:
            go!: /newNode_25

    state: newNode_171
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = {{$session.sptKz_list}}
            varName = sptKz_sel_id
            htmlEnabled = false
            then = /newNode_173

    state: newNode_285
        a: Тестовый текст

    state: newNode_21
        if: $session.spt_id = $session.spt[$session.spt_sel_id]._id
            go!: /newNode_27
        else:
            go!: /newNode_27

    state: newNode_25
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_281'});
        go!: /newNode_99
    @IntentGroup
        {
          "boundsTo" : "/newNode_25",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_99
        state: Fallback
            event: noMatch
            go!: /newNode_281
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_99",
                name: "newNode_99 buttons",
                handler: function($context) {
                }
            });

    state: newNode_173
        if: $session.sptKz_sel_id === "-"
            go!: /newNode_148
        elseif: $session.sptKz_sel_id === "+"
            go!: /newNode_0
        elseif: $session.sptKz_sel_id >= 0 && $session.sptKz_sel_id <= $session.sptKz_num
            go!: /newNode_174
        else:
            go!: /newNode_175

    state: newNode_27
        HttpRequest:
            url = https://api2.digitalagent.kz/api/navs/regions
            method = GET
            body = 
            okState = /newNode_28
            errorState = /newNode_96
            timeout = 0
            headers = []
            vars = [{"name":"regions","value":"$httpResponse"}]

    state: newNode_174
        if: $session.spt_id = $session.sptKz[$session.sptKz_sel_id]._id
            go!: /newNode_177

    state: newNode_175
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_171'});
        go!: /newNode_176
    @IntentGroup
        {
          "boundsTo" : "/newNode_175",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_176
        state: Fallback
            event: noMatch
            go!: /newNode_171
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_176",
                name: "newNode_176 buttons",
                handler: function($context) {
                }
            });

    state: newNode_28
        if: $session.reg_list = [], $session.reg_num = 0
            go!: /newNode_29
        else:
            go!: /newNode_29

    state: newNode_96
        a:  Ошибка 2: {{$session.httpStatus}}\n
            Ответ 2: {{$session.httpResponse}}\n
            Введите - чтобы вернуться назад\n
            Введите + чтобы вернуться в меню
        go!: /newNode_124
    @IntentGroup
        {
          "boundsTo" : "/newNode_96",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_124
        state: 1
            intent: /newNode_124/1

            go!: /newNode_6

        state: 2
            intent: /newNode_124/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_133
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_124",
                name: "newNode_124 buttons",
                handler: function($context) {
                }
            });

    state: newNode_177
        HttpRequest:
            url = https://api2.digitalagent.kz/api/navs/regions
            method = GET
            body = 
            okState = /newNode_178
            errorState = /newNode_179
            timeout = 0
            headers = []
            vars = [{"name":"regionsKz","value":"$httpResponse"}]

    state: newNode_29
        if: $session.regions.first()
            go!: /newNode_30
        else:
            go!: /newNode_35

    state: newNode_133
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_96'});
        go!: /newNode_134
    @IntentGroup
        {
          "boundsTo" : "/newNode_133",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_134
        state: Fallback
            event: noMatch
            go!: /newNode_96
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_134",
                name: "newNode_134 buttons",
                handler: function($context) {
                }
            });

    state: newNode_178
        if: $session.regKz_list = [], $session.regKz_num = 0
            go!: /newNode_181
        else:
            go!: /newNode_181

    state: newNode_179
        a:  Қате 2: {{$session.httpStatus}}\n
            Жауап 2: {{$session.httpResponse}}\n
            Кері оралу үшін - енгізіңіз\n
            Мәзірге оралу үшін + енгізіңіз
        go!: /newNode_180
    @IntentGroup
        {
          "boundsTo" : "/newNode_179",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_180
        state: 1
            intent: /newNode_180/1

            go!: /newNode_156

        state: 2
            intent: /newNode_180/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_182
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_180",
                name: "newNode_180 buttons",
                handler: function($context) {
                }
            });

    state: newNode_30
        if: $session.reg_str = "\n" +  $session.reg_num + " - " +  $session.regions.current().nameRu + "\n"
            go!: /newNode_31

    state: newNode_181
        if: $session.regionsKz.first()
            go!: /newNode_184

    state: newNode_182
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_179'});
        go!: /newNode_183
    @IntentGroup
        {
          "boundsTo" : "/newNode_182",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_183
        state: Fallback
            event: noMatch
            go!: /newNode_179
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_183",
                name: "newNode_183 buttons",
                handler: function($context) {
                }
            });

    state: newNode_31
        if: $session.reg_list.push($session.reg_str)
            go!: /newNode_32

    state: newNode_184
        if: $session.regKz_str = "\n" +  $session.regKz_num + " - " +  $session.regionsKz.current().nameKz + "\n"
            go!: /newNode_185

    state: newNode_32
        if: $session.regions.next()
            go!: /newNode_33
        else:
            go!: /newNode_34

    state: newNode_185
        if: $session.regKz_list.push($session.regKz_str)
            go!: /newNode_186

    state: newNode_33
        if: $session.reg_num = $session.reg_num + 1
            go!: /newNode_30
        else:
            go!: /newNode_35

    state: newNode_34
        if: $session.reg_list = String($session.reg_list).replace(/,/g, "")
            go!: /newNode_35

    state: newNode_186
        if: $session.regionsKz.next()
            go!: /newNode_187
        else:
            go!: /newNode_188

    state: newNode_35
        a:  Выберите пожалуйста регион:\n
            Введите число от 0 до {{$session.reg_num}} \n
            Введите - чтобы вернуться назад\n
            Введите + чтобы вернуться в меню
        script:
            $reactions.timeout({interval: _.template('2 seconds', {variable: '$session'})($session), targetState: '/newNode_36'});
        go!: /newNode_100
    @IntentGroup
        {
          "boundsTo" : "/newNode_35",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_100
        state: Fallback
            event: noMatch
            go!: /newNode_36
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_100",
                name: "newNode_100 buttons",
                handler: function($context) {
                }
            });

    state: newNode_187
        if: $session.regKz_num = $session.regKz_num + 1
            go!: /newNode_184
        else:
            go!: /newNode_189

    state: newNode_188
        if: $session.regKz_list = String($session.regKz_list).replace(/,/g, "")
            go!: /newNode_189

    state: newNode_36
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = {{$session.reg_list}}
            varName = reg_sel_id
            htmlEnabled = false
            then = /newNode_37

    state: newNode_189
        a:  Аймақты таңдаңыз:\n
            0 мен {{$session.regKz_num}} аралығындағы санды енгізіңіз\n
            Кері оралу үшін - енгізіңіз\n
            Мәзірге оралу үшін + енгізіңіз
        script:
            $reactions.timeout({interval: _.template('2 seconds', {variable: '$session'})($session), targetState: '/newNode_191'});
        go!: /newNode_190
    @IntentGroup
        {
          "boundsTo" : "/newNode_189",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_190
        state: Fallback
            event: noMatch
            go!: /newNode_191
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_190",
                name: "newNode_190 buttons",
                handler: function($context) {
                }
            });

    state: newNode_37
        if: $session.reg_sel_id === "-"
            go!: /newNode_17
        elseif: $session.reg_sel_id === "+"
            go!: /newNode_0
        elseif: $session.reg_sel_id >= 0 && $session.reg_sel_id <= $session.reg_num
            go!: /newNode_38
        else:
            go!: /newNode_39

    state: newNode_191
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = {{$session.regKz_list}}
            varName = regKz_sel_id
            htmlEnabled = false
            then = /newNode_192

    state: newNode_38
        if: $session.region_id = $session.regions[$session.reg_sel_id]._id
            go!: /newNode_40
        else:
            go!: /newNode_40

    state: newNode_39
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_36'});
        go!: /newNode_101
    @IntentGroup
        {
          "boundsTo" : "/newNode_39",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_101
        state: Fallback
            event: noMatch
            go!: /newNode_36
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_101",
                name: "newNode_101 buttons",
                handler: function($context) {
                }
            });

    state: newNode_192
        if: $session.regKz_sel_id === "-"
            go!: /newNode_170
        elseif: $session.regKz_sel_id === "+"
            go!: /newNode_0
        elseif: $session.regKz_sel_id >= 0 && $session.regKz_sel_id <= $session.regKz_num
            go!: /newNode_193
        else:
            go!: /newNode_194

    state: newNode_40
        HttpRequest:
            url = https://api2.digitalagent.kz/api/navs/raions?regionId=${region_id}
            method = GET
            body = 
            okState = /newNode_41
            errorState = /newNode_102
            timeout = 0
            headers = []
            vars = [{"name":"raions","value":"$httpResponse"}]

    state: newNode_193
        if: $session.region_id = $session.regionsKz[$session.regKz_sel_id]._id
            go!: /newNode_196

    state: newNode_194
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_191'});
        go!: /newNode_195
    @IntentGroup
        {
          "boundsTo" : "/newNode_194",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_195
        state: Fallback
            event: noMatch
            go!: /newNode_191
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_195",
                name: "newNode_195 buttons",
                handler: function($context) {
                }
            });

    state: newNode_41
        if: $session.rai_list = [], $session.rai_num = 0
            go!: /newNode_42
        else:
            go!: /newNode_42

    state: newNode_102
        a:  Ошибка 3: {{$session.httpStatus}}\n
            Ответ 3: {{$session.httpResponse}}\n
            Введите - чтобы вернуться назад\n
            Введите + чтобы вернуться в меню
        go!: /newNode_125
    @IntentGroup
        {
          "boundsTo" : "/newNode_102",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_125
        state: 1
            intent: /newNode_125/1

            go!: /newNode_27

        state: 2
            intent: /newNode_125/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_135
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_125",
                name: "newNode_125 buttons",
                handler: function($context) {
                }
            });

    state: newNode_196
        HttpRequest:
            url = https://api2.digitalagent.kz/api/navs/raions?regionId=${region_id}
            method = GET
            body = 
            okState = /newNode_197
            errorState = /newNode_198
            timeout = 0
            headers = []
            vars = [{"name":"raionsKz","value":"$httpResponse"}]

    state: newNode_42
        if: $session.raions.first()
            go!: /newNode_43
        else:
            go!: /newNode_48

    state: newNode_135
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_102'});
        go!: /newNode_136
    @IntentGroup
        {
          "boundsTo" : "/newNode_135",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_136
        state: Fallback
            event: noMatch
            go!: /newNode_102
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_136",
                name: "newNode_136 buttons",
                handler: function($context) {
                }
            });

    state: newNode_197
        if: $session.raiKz_list = [], $session.raiKz_num = 0
            go!: /newNode_200
        else:
            go!: /newNode_200

    state: newNode_198
        a:  Қате 3: {{$session.httpStatus}}\n
            Жауап 3: {{$session.httpResponse}}\n
            Кері оралу үшін - енгізіңіз\n
            Мәзірге оралу үшін + енгізіңіз
        go!: /newNode_199
    @IntentGroup
        {
          "boundsTo" : "/newNode_198",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_199
        state: 1
            intent: /newNode_199/1

            go!: /newNode_177

        state: 2
            intent: /newNode_199/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_201
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_199",
                name: "newNode_199 buttons",
                handler: function($context) {
                }
            });

    state: newNode_43
        if: $session.rai_str = "\n" +  $session.rai_num + " - " +  $session.raions.current().nameRu + "\n"
            go!: /newNode_44

    state: newNode_200
        if: $session.raionsKz.first()
            go!: /newNode_203

    state: newNode_201
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('2 seconds', {variable: '$session'})($session), targetState: '/newNode_198'});
        go!: /newNode_202
    @IntentGroup
        {
          "boundsTo" : "/newNode_201",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_202
        state: Fallback
            event: noMatch
            go!: /newNode_198
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_202",
                name: "newNode_202 buttons",
                handler: function($context) {
                }
            });

    state: newNode_44
        if: $session.rai_list.push($session.rai_str)
            go!: /newNode_45

    state: newNode_203
        if: $session.raiKz_str = "\n" +  $session.raiKz_num + " - " +  $session.raionsKz.current().nameKz + "\n"
            go!: /newNode_204

    state: newNode_45
        if: $session.raions.next()
            go!: /newNode_46
        else:
            go!: /newNode_47

    state: newNode_204
        if: $session.raiKz_list.push($session.raiKz_str)
            go!: /newNode_205

    state: newNode_46
        if: $session.rai_num = $session.rai_num + 1
            go!: /newNode_43
        else:
            go!: /newNode_48

    state: newNode_47
        if: $session.rai_list = String($session.rai_list).replace(/,/g, "")
            go!: /newNode_48

    state: newNode_205
        if: $session.raionsKz.next()
            go!: /newNode_206
        else:
            go!: /newNode_207

    state: newNode_48
        a:  Выберите пожалуйста район:\n
            Введите число от 0 до {{$session.rai_num}} \n
            Введите - чтобы вернуться назад\n
            Введите + чтобы вернуться в меню
        script:
            $reactions.timeout({interval: _.template('2 seconds', {variable: '$session'})($session), targetState: '/newNode_49'});
        go!: /newNode_103
    @IntentGroup
        {
          "boundsTo" : "/newNode_48",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_103
        state: Fallback
            event: noMatch
            go!: /newNode_49
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_103",
                name: "newNode_103 buttons",
                handler: function($context) {
                }
            });

    state: newNode_206
        if: $session.raiKz_num = $session.raiKz_num + 1
            go!: /newNode_203
        else:
            go!: /newNode_208

    state: newNode_207
        if: $session.raiKz_list = String($session.raiKz_list).replace(/,/g, "")
            go!: /newNode_208

    state: newNode_49
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = {{$session.rai_list}}
            varName = rai_sel_id
            htmlEnabled = false
            then = /newNode_50

    state: newNode_208
        a:  Ауданды таңдаңыз:\n
            0 мен {{$session.raiKz_num}} аралығындағы санды енгізіңіз\n
            Кері оралу үшін - енгізіңіз\n
            Мәзірге оралу үшін + енгізіңіз
        script:
            $reactions.timeout({interval: _.template('2 seconds', {variable: '$session'})($session), targetState: '/newNode_210'});
        go!: /newNode_209
    @IntentGroup
        {
          "boundsTo" : "/newNode_208",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_209
        state: Fallback
            event: noMatch
            go!: /newNode_210
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_209",
                name: "newNode_209 buttons",
                handler: function($context) {
                }
            });

    state: newNode_50
        if: $session.rai_sel_id === "-"
            go!: /newNode_35
        elseif: $session.rai_sel_id === "+"
            go!: /newNode_0
        elseif: $session.rai_sel_id >= 0 && $session.rai_sel_id <= $session.rai_num
            go!: /newNode_51
        else:
            go!: /newNode_52

    state: newNode_210
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = {{$session.raiKz_list}}
            varName = raiKz_sel_id
            htmlEnabled = false
            then = /newNode_211

    state: newNode_51
        if: $session.raion_id = $session.raions[$session.rai_sel_id]._id
            go!: /newNode_53
        else:
            go!: /newNode_53

    state: newNode_52
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_49'});
        go!: /newNode_104
    @IntentGroup
        {
          "boundsTo" : "/newNode_52",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_104
        state: Fallback
            event: noMatch
            go!: /newNode_49
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_104",
                name: "newNode_104 buttons",
                handler: function($context) {
                }
            });

    state: newNode_211
        if: $session.raiKz_sel_id === "-"
            go!: /newNode_189
        elseif: $session.raiKz_sel_id === "+"
            go!: /newNode_0
        elseif: $session.raiKz_sel_id >= 0 && $session.raiKz_sel_id <= $session.raiKz_num
            go!: /newNode_212
        else:
            go!: /newNode_213

    state: newNode_53
        HttpRequest:
            url = https://api2.digitalagent.kz/api/service-providers/bot?raionId=${raion_id}&serviceProviderTypeId=${spt_id}
            method = GET
            body = 
            okState = /newNode_54
            errorState = /newNode_105
            timeout = 0
            headers = []
            vars = [{"name":"orgs","value":"$httpResponse"}]

    state: newNode_212
        if: $session.raion_id = $session.raionsKz[$session.raiKz_sel_id]._id
            go!: /newNode_215

    state: newNode_213
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_210'});
        go!: /newNode_214
    @IntentGroup
        {
          "boundsTo" : "/newNode_213",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_214
        state: Fallback
            event: noMatch
            go!: /newNode_210
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_214",
                name: "newNode_214 buttons",
                handler: function($context) {
                }
            });

    state: newNode_54
        if: $session.org_list = [], $session.org_num = 0
            go!: /newNode_55
        elseif: $session.orgs.length === 0
            go!: /newNode_68
        else:
            go!: /newNode_55

    state: newNode_105
        a:  Ошибка 4: {{$session.httpStatus}}\n
            Ответ 4: {{$session.httpResponse}}\n
            Введите - чтобы вернуться назад\n
            Введите + чтобы вернуться в меню
        go!: /newNode_111
    @IntentGroup
        {
          "boundsTo" : "/newNode_105",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_111
        state: 1
            intent: /newNode_111/1

            go!: /newNode_40

        state: 2
            intent: /newNode_111/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_137
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_111",
                name: "newNode_111 buttons",
                handler: function($context) {
                }
            });

    state: newNode_215
        HttpRequest:
            url = https://api2.digitalagent.kz/api/service-providers/bot?raionId=${raion_id}&serviceProviderTypeId=${spt_id}
            method = GET
            body = 
            okState = /newNode_216
            errorState = /newNode_217
            timeout = 0
            headers = []
            vars = [{"name":"orgsKz","value":"$httpResponse"}]

    state: newNode_55
        if: $session.orgs.first()
            go!: /newNode_56
        else:
            go!: /newNode_61

    state: newNode_68
        a:  Здесь нет организации.\n
            Введите - чтобы вернуться назад\n
            Введите + чтобы вернуться в меню
        go!: /newNode_69
    @IntentGroup
        {
          "boundsTo" : "/newNode_68",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_69
        state: 1
            intent: /newNode_69/1

            go!: /newNode_48

        state: 2
            intent: /newNode_69/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_139
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_69",
                name: "newNode_69 buttons",
                handler: function($context) {
                }
            });

    state: newNode_137
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_105'});
        go!: /newNode_138
    @IntentGroup
        {
          "boundsTo" : "/newNode_137",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_138
        state: Fallback
            event: noMatch
            go!: /newNode_105
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_138",
                name: "newNode_138 buttons",
                handler: function($context) {
                }
            });

    state: newNode_216
        if: $session.orgKz_list = [], $session.orgKz_num = 0
            go!: /newNode_219
        elseif: $session.orgsKz.length === 0
            go!: /newNode_220
        else:
            go!: /newNode_219

    state: newNode_217
        a:  Қате 4: {{$session.httpStatus}}\n
            Жауап 4: {{$session.httpResponse}}\n
            Кері оралу үшін - енгізіңіз\n
            Мәзірге оралу үшін + енгізіңіз
        go!: /newNode_218
    @IntentGroup
        {
          "boundsTo" : "/newNode_217",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_218
        state: 1
            intent: /newNode_218/1

            go!: /newNode_196

        state: 2
            intent: /newNode_218/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_224
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_218",
                name: "newNode_218 buttons",
                handler: function($context) {
                }
            });

    state: newNode_56
        if: $session.org_str = "\n" +  $session.org_num + " - " +  $session.orgs.current().nameRu + "\n"
            go!: /newNode_57

    state: newNode_139
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_68'});
        go!: /newNode_140
    @IntentGroup
        {
          "boundsTo" : "/newNode_139",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_140
        state: Fallback
            event: noMatch
            go!: /newNode_68
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_140",
                name: "newNode_140 buttons",
                handler: function($context) {
                }
            });

    state: newNode_219
        if: $session.orgsKz.first()
            go!: /newNode_226

    state: newNode_220
        a:  Мұнда ешқандай ұйым жоқ.\n
            Кері оралу үшін - енгізіңіз\n
            Мәзірге оралу үшін + енгізіңіз
        go!: /newNode_221
    @IntentGroup
        {
          "boundsTo" : "/newNode_220",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_221
        state: 1
            intent: /newNode_221/1

            go!: /newNode_208

        state: 2
            intent: /newNode_221/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_222
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_221",
                name: "newNode_221 buttons",
                handler: function($context) {
                }
            });

    state: newNode_224
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_217'});
        go!: /newNode_225
    @IntentGroup
        {
          "boundsTo" : "/newNode_224",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_225
        state: Fallback
            event: noMatch
            go!: /newNode_217
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_225",
                name: "newNode_225 buttons",
                handler: function($context) {
                }
            });

    state: newNode_57
        if: $session.org_list.push($session.org_str)
            go!: /newNode_58

    state: newNode_222
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_220'});
        go!: /newNode_223
    @IntentGroup
        {
          "boundsTo" : "/newNode_222",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_223
        state: Fallback
            event: noMatch
            go!: /newNode_220
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_223",
                name: "newNode_223 buttons",
                handler: function($context) {
                }
            });

    state: newNode_226
        if: $session.orgKz_str = "\n" +  $session.orgKz_num + " - " +  $session.orgsKz.current().nameKz + "\n"
            go!: /newNode_227

    state: newNode_58
        if: $session.orgs.next()
            go!: /newNode_59
        else:
            go!: /newNode_60

    state: newNode_227
        if: $session.orgKz_list.push($session.orgKz_str)
            go!: /newNode_228

    state: newNode_59
        if: $session.org_num = $session.org_num + 1
            go!: /newNode_56
        else:
            go!: /newNode_61

    state: newNode_60
        if: $session.org_list = String($session.org_list).replace(/,/g, "")
            go!: /newNode_61

    state: newNode_228
        if: $session.orgsKz.next()
            go!: /newNode_229
        else:
            go!: /newNode_230

    state: newNode_61
        a:  Выберите пожалуйста организацию:\n
            Введите число от 0 до {{$session.org_num}} \n
            Введите - чтобы вернуться назад\n
            Введите + чтобы вернуться в меню
        script:
            $reactions.timeout({interval: _.template('2 seconds', {variable: '$session'})($session), targetState: '/newNode_62'});
        go!: /newNode_106
    @IntentGroup
        {
          "boundsTo" : "/newNode_61",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_106
        state: Fallback
            event: noMatch
            go!: /newNode_62
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_106",
                name: "newNode_106 buttons",
                handler: function($context) {
                }
            });

    state: newNode_229
        if: $session.orgKz_num = $session.orgKz_num + 1
            go!: /newNode_226
        else:
            go!: /newNode_231

    state: newNode_230
        if: $session.orgKz_list = String($session.orgKz_list).replace(/,/g, "")
            go!: /newNode_231

    state: newNode_62
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = {{$session.org_list}}
            varName = org_sel_id
            htmlEnabled = false
            then = /newNode_63

    state: newNode_231
        a:  Ұйымды таңдаңыз::\n
            0 мен {{$session.orgKz_num}} аралығындағы санды енгізіңіз\n
            Кері оралу үшін - енгізіңіз\n
            Мәзірге оралу үшін + енгізіңіз
        script:
            $reactions.timeout({interval: _.template('2 seconds', {variable: '$session'})($session), targetState: '/newNode_233'});
        go!: /newNode_232
    @IntentGroup
        {
          "boundsTo" : "/newNode_231",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_232
        state: Fallback
            event: noMatch
            go!: /newNode_233
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_232",
                name: "newNode_232 buttons",
                handler: function($context) {
                }
            });

    state: newNode_63
        if: $session.org_sel_id === "-"
            go!: /newNode_48
        elseif: $session.org_sel_id === "+"
            go!: /newNode_0
        elseif: $session.org_sel_id >= 0 && $session.org_sel_id <= $session.org_num
            go!: /newNode_64
        else:
            go!: /newNode_65

    state: newNode_233
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = {{$session.orgKz_list}}
            varName = orgKz_sel_id
            htmlEnabled = false
            then = /newNode_234

    state: newNode_64
        if: $session.org_id = $session.orgs[$session.org_sel_id]._id
            go!: /newNode_66
        else:
            go!: /newNode_66

    state: newNode_65
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_62'});
        go!: /newNode_107
    @IntentGroup
        {
          "boundsTo" : "/newNode_65",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_107
        state: Fallback
            event: noMatch
            go!: /newNode_62
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_107",
                name: "newNode_107 buttons",
                handler: function($context) {
                }
            });

    state: newNode_234
        if: $session.orgKz_sel_id === "-"
            go!: /newNode_208
        elseif: $session.orgKz_sel_id === "+"
            go!: /newNode_0
        elseif: $session.orgKz_sel_id >= 0 && $session.orgKz_sel_id <= $session.orgKz_num
            go!: /newNode_235
        else:
            go!: /newNode_236

    state: newNode_66
        if: $session.org_name = $session.orgs[$session.org_sel_id].nameRu
            go!: /newNode_67
        else:
            go!: /newNode_67

    state: newNode_235
        if: $session.org_id = $session.orgsKz[$session.orgKz_sel_id]._id
            go!: /newNode_238
        else:
            go!: /newNode_238

    state: newNode_236
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_233'});
        go!: /newNode_237
    @IntentGroup
        {
          "boundsTo" : "/newNode_236",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_237
        state: Fallback
            event: noMatch
            go!: /newNode_233
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_237",
                name: "newNode_237 buttons",
                handler: function($context) {
                }
            });

    state: newNode_67
        a:  Вы выбрали: \n
            {{$session.org_name}}
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_112'});
        go!: /newNode_109
    @IntentGroup
        {
          "boundsTo" : "/newNode_67",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_109
        state: Fallback
            event: noMatch
            go!: /newNode_112
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_109",
                name: "newNode_109 buttons",
                handler: function($context) {
                }
            });

    state: newNode_238
        if: $session.orgKz_name = $session.orgsKz[$session.orgKz_sel_id].nameKz
            go!: /newNode_239
        else:
            go!: /newNode_239

    state: newNode_112
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = Оцените пожалуйста от 1 до 5 \n
                Введите - чтобы вернуться назад \n
                Введите + чтобы вернуться в меню
            varName = rate
            htmlEnabled = false
            then = /newNode_110

    state: newNode_239
        a:  Сіз таңдадыңыз:\n
            {{$session.orgKz_name}}
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_241'});
        go!: /newNode_240
    @IntentGroup
        {
          "boundsTo" : "/newNode_239",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_240
        state: Fallback
            event: noMatch
            go!: /newNode_241
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_240",
                name: "newNode_240 buttons",
                handler: function($context) {
                }
            });

    state: newNode_72
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = Введите пожалуйста комментарий \n
                Введите - чтобы вернуться назад \n
                Введите + чтобы вернуться в меню
            varName = comments
            htmlEnabled = false
            then = /newNode_115

    state: newNode_110
        if: $session.rate >= 0 && $session.rate <= 5
            go!: /newNode_72
        elseif: $session.rate === "-"
            go!: /newNode_61
        elseif: $session.rate === "+"
            go!: /newNode_0
        else:
            go!: /newNode_113

    state: newNode_241
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = 1-ден 5-ке дейін бағалаңыз \n
                Кері оралу үшін - енгізіңіз \n
                Мәзірге оралу үшін + енгізіңіз
            varName = rate
            htmlEnabled = false
            then = /newNode_242

    state: newNode_73
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = Введите пожалуйста номер мобильного телефона \n
                Введите - чтобы вернуться назад \n
                Введите + чтобы вернуться в меню
            varName = mob_phone_num
            htmlEnabled = false
            then = /newNode_116

    state: newNode_113
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_112'});
        go!: /newNode_114
    @IntentGroup
        {
          "boundsTo" : "/newNode_113",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_114
        state: Fallback
            event: noMatch
            go!: /newNode_112
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_114",
                name: "newNode_114 buttons",
                handler: function($context) {
                }
            });

    state: newNode_115
        if: $session.comments === "-"
            go!: /newNode_112
        elseif: $session.comments === "+"
            go!: /newNode_0
        else:
            go!: /newNode_73

    state: newNode_242
        if: $session.rate === "-"
            go!: /newNode_231
        elseif: $session.rate === "+"
            go!: /newNode_0
        elseif: $session.rate >= 0 && $session.rate <= 5
            go!: /newNode_243
        else:
            go!: /newNode_244

    state: newNode_74
        HttpRequest:
            url = https://api2.digitalagent.kz/api/auth/signin/mobile/getCode
            method = POST
            body = {
                "phone": "{{$session.mob_phone_num}}"
                }
            okState = /newNode_75
            errorState = /newNode_76
            timeout = 0
            headers = []
            vars = [{"name":"send_sms_response","value":"$httpResponse"}]

    state: newNode_116
        if: $session.mob_phone_num === "-"
            go!: /newNode_72
        elseif: $session.mob_phone_num === "+"
            go!: /newNode_0
        else:
            go!: /newNode_74

    state: newNode_243
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = Пікір енгізіңіз \n
                Кері оралу үшін - енгізіңіз \n
                Мәзірге оралу үшін + енгізіңіз
            varName = comments
            htmlEnabled = false
            then = /newNode_246

    state: newNode_244
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_241'});
        go!: /newNode_245
    @IntentGroup
        {
          "boundsTo" : "/newNode_244",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_245
        state: Fallback
            event: noMatch
            go!: /newNode_241
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_245",
                name: "newNode_245 buttons",
                handler: function($context) {
                }
            });

    state: newNode_75
        if: $session.send_sms_response.success===true
            go!: /newNode_77
        else:
            go!: /newNode_76

    state: newNode_76
        a:  Ошибка 5: {{$session.httpStatus}}\n
            Ответ 5: {{$session.httpResponse}}\n
            Введите - чтобы вернуться назад\n
            Введите + чтобы вернуться в меню
        go!: /newNode_126
    @IntentGroup
        {
          "boundsTo" : "/newNode_76",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_126
        state: 1
            intent: /newNode_126/1

            go!: /newNode_73

        state: 2
            intent: /newNode_126/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_141
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_126",
                name: "newNode_126 buttons",
                handler: function($context) {
                }
            });

    state: newNode_246
        if: $session.comments === "-"
            go!: /newNode_241
        elseif: $session.comments === "+"
            go!: /newNode_0
        else:
            go!: /newNode_247

    state: newNode_77
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = Введите пожалуйста отправленный SMS код \n
                Введите * чтобы отправить SMS код ещё раз \n
                Введите - чтобы вернуться назад \n
                Введите + чтобы вернуться в меню
            varName = sms_code
            htmlEnabled = false
            then = /newNode_117

    state: newNode_141
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_76'});
        go!: /newNode_142
    @IntentGroup
        {
          "boundsTo" : "/newNode_141",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_142
        state: Fallback
            event: noMatch
            go!: /newNode_76
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_142",
                name: "newNode_142 buttons",
                handler: function($context) {
                }
            });

    state: newNode_247
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = Ұялы телефондағы нөміріңізді енгізіңіз \n
                Кері оралу үшін - енгізіңіз \n
                Мәзірге оралу үшін + енгізіңіз
            varName = mob_phone_num
            htmlEnabled = false
            then = /newNode_248

    state: newNode_78
        HttpRequest:
            url = https://api2.digitalagent.kz/api/auth/signin/mobile
            method = POST
            body = {
                "phone":"{{$session.mob_phone_num}}",
                "code":"{{$session.sms_code}}"
                }
            okState = /newNode_79
            errorState = /newNode_79
            timeout = 0
            headers = []
            vars = [{"name":"check_sms_response","value":"$httpResponse"}]

    state: newNode_117
        if: $session.sms_code === "-"
            go!: /newNode_73
        elseif: $session.sms_code === "+"
            go!: /newNode_0
        elseif: $session.sms_code === "*"
            go!: /newNode_74
        else:
            go!: /newNode_78

    state: newNode_248
        if: $session.mob_phone_num === "-"
            go!: /newNode_243
        elseif: $session.mob_phone_num === "+"
            go!: /newNode_0
        else:
            go!: /newNode_249

    state: newNode_79
        if: ($session.check_sms_response !== undefined && $session.check_sms_response.token !== undefined)
            go!: /newNode_80
        else:
            go!: /newNode_82

    state: newNode_249
        HttpRequest:
            url = https://api2.digitalagent.kz/api/auth/signin/mobile/getCode
            method = POST
            body = {
                "phone": "{{$session.mob_phone_num}}"
                }
            okState = /newNode_250
            errorState = /newNode_251
            timeout = 0
            headers = []
            vars = [{"name":"send_sms_response","value":"$httpResponse"}]

    state: newNode_80
        if: $session.token=$session.check_sms_response.token
            go!: /newNode_81
        else:
            go!: /newNode_81

    state: newNode_82
        a: SMS код не корректный
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_77'});
        go!: /newNode_108
    @IntentGroup
        {
          "boundsTo" : "/newNode_82",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_108
        state: Fallback
            event: noMatch
            go!: /newNode_77
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_108",
                name: "newNode_108 buttons",
                handler: function($context) {
                }
            });

    state: newNode_250
        if: $session.send_sms_response.success===true
            go!: /newNode_253

    state: newNode_251
        a:  Қате 5: {{$session.httpStatus}}\n
            Жауап 5: {{$session.httpResponse}}\n
            Кері оралу үшін - енгізіңіз\n
            Мәзірге оралу үшін + енгізіңіз
        go!: /newNode_252
    @IntentGroup
        {
          "boundsTo" : "/newNode_251",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_252
        state: 1
            intent: /newNode_252/1

            go!: /newNode_247

        state: 2
            intent: /newNode_252/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_254
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_252",
                name: "newNode_252 buttons",
                handler: function($context) {
                }
            });

    state: newNode_81
        HttpRequest:
            url = https://api2.digitalagent.kz/api/reviews/bot
            method = POST
            body = {
                "text":"{{$session.comments}}",
                "rate":{{$session.rate}},
                "serviceProviderId":"{{$session.org_id}}",
                "channel":"{{$session.channelType}}"
                }
            okState = /newNode_83
            errorState = /newNode_84
            timeout = 0
            headers = [{"name":"Authorization","value":"{{$session.token}}"}]
            vars = [{"name":"send_review_response","value":"$httpResponse"}]

    state: newNode_253
        InputText:
            actions = [{"buttons":[],"type":"buttons"}]
            prompt = Жіберілген SMS кодты енгізіңіз \n
                SMS кодты қайта жіберу үшін * енгізіңіз \n
                Кері оралу үшін - енгізіңіз \n
                Мәзірге оралу үшін + енгізіңіз
            varName = sms_code
            htmlEnabled = false
            then = /newNode_256

    state: newNode_254
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_251'});
        go!: /newNode_255
    @IntentGroup
        {
          "boundsTo" : "/newNode_254",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_255
        state: Fallback
            event: noMatch
            go!: /newNode_251
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_255",
                name: "newNode_255 buttons",
                handler: function($context) {
                }
            });

    state: newNode_278
        if: $session.channelType == "telegram"
            go!: /newNode_81
        elseif: $session.channelType == "facebook"
            go!: /newNode_81
        elseif: $session.channelType == "vk"
            go!: /newNode_81
        else:
            go!: /newNode_279

    state: newNode_83
        if: $session.send_review_response
            go!: /newNode_119
        else:
            go!: /newNode_84

    state: newNode_84
        a:  Ошибка 6: {{$session.httpStatus}}\n
            Ответ 6: {{$session.httpResponse}}\n
            Введите - чтобы вернуться назад\n
            Введите + чтобы вернуться в меню
        go!: /newNode_127
    @IntentGroup
        {
          "boundsTo" : "/newNode_84",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_127
        state: 1
            intent: /newNode_127/1

            go!: /newNode_73

        state: 2
            intent: /newNode_127/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_143
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_127",
                name: "newNode_127 buttons",
                handler: function($context) {
                }
            });

    state: newNode_256
        if: $session.sms_code === "-"
            go!: /newNode_247
        elseif: $session.sms_code === "+"
            go!: /newNode_0
        elseif: $session.sms_code === "*"
            go!: /newNode_249
        else:
            go!: /newNode_257

    state: newNode_279
        a: ошибка от канал условия

    state: newNode_85
        a:  Вы хотите оставить ещё один отзыв?\n
            0 - Нет\n
            1 - Да
        go!: /newNode_86
    @IntentGroup
        {
          "boundsTo" : "/newNode_85",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_86
        state: 1
            intent: /newNode_86/1

            go!: /newNode_87

        state: 2
            intent: /newNode_86/2

            go!: /newNode_6

        state: Fallback
            event: noMatch
            go!: /newNode_118
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_86",
                name: "newNode_86 buttons",
                handler: function($context) {
                }
            });

    state: newNode_119
        a:  Ваш отзыв успешно отправлен!\n
            Вы можете проверить статус своего отзыва или оставить новый в мобильном приложении Digital Agent: http://onelink.to/digitalagent
        script:
            $reactions.timeout({interval: _.template('5 seconds', {variable: '$session'})($session), targetState: '/newNode_85'});
        go!: /newNode_145
    @IntentGroup
        {
          "boundsTo" : "/newNode_119",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_145
        state: Fallback
            event: noMatch
            go!: /newNode_85
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_145",
                name: "newNode_145 buttons",
                handler: function($context) {
                }
            });

    state: newNode_143
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_84'});
        go!: /newNode_144
    @IntentGroup
        {
          "boundsTo" : "/newNode_143",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_144
        state: Fallback
            event: noMatch
            go!: /newNode_84
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_144",
                name: "newNode_144 buttons",
                handler: function($context) {
                }
            });

    state: newNode_257
        HttpRequest:
            url = https://api2.digitalagent.kz/api/auth/signin/mobile
            method = POST
            body = {
                "phone":"{{$session.mob_phone_num}}",
                "code":"{{$session.sms_code}}"
                }
            okState = /newNode_258
            errorState = /newNode_258
            timeout = 0
            headers = []
            vars = [{"name":"check_sms_response","value":"$httpResponse"}]

    state: newNode_87
        a:  Спасибо за ваш отзыв!\n
            Введите + чтобы вернуться в меню
        go!: /newNode_120
    @IntentGroup
        {
          "boundsTo" : "/newNode_87",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_120
        state: 1
            intent: /newNode_120/1

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_128
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_120",
                name: "newNode_120 buttons",
                handler: function($context) {
                }
            });

    state: newNode_118
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_85'});
        go!: /newNode_146
    @IntentGroup
        {
          "boundsTo" : "/newNode_118",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_146
        state: Fallback
            event: noMatch
            go!: /newNode_85
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_146",
                name: "newNode_146 buttons",
                handler: function($context) {
                }
            });

    state: newNode_258
        if: ($session.check_sms_response !== undefined && $session.check_sms_response.token !== undefined)
            go!: /newNode_259
        else:
            go!: /newNode_260

    state: newNode_128
        a: Попробуйте ещё раз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_87'});
        go!: /newNode_147
    @IntentGroup
        {
          "boundsTo" : "/newNode_128",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_147
        state: Fallback
            event: noMatch
            go!: /newNode_87
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_147",
                name: "newNode_147 buttons",
                handler: function($context) {
                }
            });

    state: newNode_259
        if: $session.token=$session.check_sms_response.token
            go!: /newNode_262
        else:
            go!: /newNode_262

    state: newNode_260
        a: SMS код дұрыс емес
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_253'});
        go!: /newNode_261
    @IntentGroup
        {
          "boundsTo" : "/newNode_260",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_261
        state: Fallback
            event: noMatch
            go!: /newNode_253
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_261",
                name: "newNode_261 buttons",
                handler: function($context) {
                }
            });

    state: newNode_262
        HttpRequest:
            url = https://api2.digitalagent.kz/api/reviews/bot
            method = POST
            body = {
                "text":"{{$session.comments}}",
                "rate":{{$session.rate}},
                "serviceProviderId":"{{$session.org_id}}",
                "channel":"{{$session.channelType}}"
                }
            okState = /newNode_263
            errorState = /newNode_264
            timeout = 0
            headers = [{"name":"Authorization","value":"{{$session.token}}"}]
            vars = [{"name":"send_review_response","value":"$httpResponse"}]

    state: newNode_280
        if: $session.channelType == "telegram"
            go!: /newNode_262
        elseif: $session.channelType == "facebook"
            go!: /newNode_262
        elseif: $session.channelType == "vk"
            go!: /newNode_262

    state: newNode_263
        if: $session.send_review_response
            go!: /newNode_266
        else:
            go!: /newNode_264

    state: newNode_264
        a:  Қате 6: {{$session.httpStatus}}\n
            Жауап 6: {{$session.httpResponse}}\n
            Кері оралу үшін - енгізіңіз\n
            Мәзірге оралу үшін + енгізіңіз
        go!: /newNode_265
    @IntentGroup
        {
          "boundsTo" : "/newNode_264",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_265
        state: 1
            intent: /newNode_265/1

            go!: /newNode_247

        state: 2
            intent: /newNode_265/2

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_269
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_265",
                name: "newNode_265 buttons",
                handler: function($context) {
                }
            });

    state: newNode_266
        a:  Пікіріңіз сәтті жіберілді!\n
            Сіз Digital Agent мобильді қосымшасында шағымыңыздың күйін тексере немесе жаңасын қалдыра аласыз: http://onelink.to/digitalagent
        script:
            $reactions.timeout({interval: _.template('5 seconds', {variable: '$session'})($session), targetState: '/newNode_268'});
        go!: /newNode_267
    @IntentGroup
        {
          "boundsTo" : "/newNode_266",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_267
        state: Fallback
            event: noMatch
            go!: /newNode_268
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_267",
                name: "newNode_267 buttons",
                handler: function($context) {
                }
            });

    state: newNode_269
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_264'});
        go!: /newNode_270
    @IntentGroup
        {
          "boundsTo" : "/newNode_269",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_270
        state: Fallback
            event: noMatch
            go!: /newNode_264
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_270",
                name: "newNode_270 buttons",
                handler: function($context) {
                }
            });

    state: newNode_268
        a:  Тағы бір пікір қалдырғыңыз келе ме?\n
            0 - Жоқ\n
            1 - Иә
        go!: /newNode_271
    @IntentGroup
        {
          "boundsTo" : "/newNode_268",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_271
        state: 1
            intent: /newNode_271/1

            go!: /newNode_272

        state: 2
            intent: /newNode_271/2

            go!: /newNode_156

        state: Fallback
            event: noMatch
            go!: /newNode_274
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_271",
                name: "newNode_271 buttons",
                handler: function($context) {
                }
            });

    state: newNode_272
        a:  Пікіріңіз үшін рақмет!\n
            Мәзірге оралу үшін + енгізіңіз
        go!: /newNode_273
    @IntentGroup
        {
          "boundsTo" : "/newNode_272",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_273
        state: 1
            intent: /newNode_273/1

            go!: /newNode_0

        state: Fallback
            event: noMatch
            go!: /newNode_276
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_273",
                name: "newNode_273 buttons",
                handler: function($context) {
                }
            });

    state: newNode_274
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_268'});
        go!: /newNode_275
    @IntentGroup
        {
          "boundsTo" : "/newNode_274",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_275
        state: Fallback
            event: noMatch
            go!: /newNode_268
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_275",
                name: "newNode_275 buttons",
                handler: function($context) {
                }
            });

    state: newNode_276
        a: Қайта теріп көріңіз!
        script:
            $reactions.timeout({interval: _.template('1 seconds', {variable: '$session'})($session), targetState: '/newNode_272'});
        go!: /newNode_277
    @IntentGroup
        {
          "boundsTo" : "/newNode_276",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_277
        state: Fallback
            event: noMatch
            go!: /newNode_272
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_277",
                name: "newNode_277 buttons",
                handler: function($context) {
                }
            });