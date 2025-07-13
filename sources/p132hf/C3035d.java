package p132hf;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.colonize.login.ColonizeMarsToolLoginViewModel$login$1", m7452f = "ColonizeMarsToolLoginViewModel.kt", m7453l = {71, 73, 81}, m7454m = "invokeSuspend")
/* renamed from: hf.d */
/* loaded from: classes.dex */
public final class C3035d extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public int f12221c0;

    /* renamed from: d0 */
    public /* synthetic */ java.lang.Object f12222d0;

    /* renamed from: e0 */
    public final /* synthetic */ p132hf.C3036e f12223e0;

    /* renamed from: f0 */
    public final /* synthetic */ java.lang.String f12224f0;

    /* renamed from: g0 */
    public final /* synthetic */ java.lang.String f12225g0;

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.colonize.login.ColonizeMarsToolLoginViewModel$login$1$2$1", m7452f = "ColonizeMarsToolLoginViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
    /* renamed from: hf.d$a */
    public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public final /* synthetic */ p132hf.C3036e f12226c0;

        /* renamed from: d0 */
        public final /* synthetic */ java.lang.String f12227d0;

        /* renamed from: e0 */
        public final /* synthetic */ java.lang.String f12228e0;

        /* renamed from: f0 */
        public final /* synthetic */ java.lang.String f12229f0;

        public a(p132hf.C3036e r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, p101fh.InterfaceC2172d<? super p132hf.C3035d.a> r5) {
                r0 = this;
                r0.f12226c0 = r1
                r0.f12227d0 = r2
                r0.f12228e0 = r3
                r0.f12229f0 = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r7, p101fh.InterfaceC2172d<?> r8) {
                r6 = this;
                hf.d$a r7 = new hf.d$a
                hf.e r1 = r6.f12226c0
                java.lang.String r2 = r6.f12227d0
                java.lang.String r3 = r6.f12228e0
                java.lang.String r4 = r6.f12229f0
                r0 = r7
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r7
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r7, p101fh.InterfaceC2172d<? super ch.C0985l> r8) {
                r6 = this;
                vh.b0 r7 = (p379vh.InterfaceC6686b0) r7
                r5 = r8
                fh.d r5 = (p101fh.InterfaceC2172d) r5
                hf.d$a r7 = new hf.d$a
                hf.e r1 = r6.f12226c0
                java.lang.String r2 = r6.f12227d0
                java.lang.String r3 = r6.f12228e0
                java.lang.String r4 = r6.f12229f0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                ch.l r8 = ch.C0985l.f5061a
                r7.mo123o(r8)
                return r8
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r3) {
                r2 = this;
                p074e9.C1805a.m4540y(r3)
                hf.e r3 = r2.f12226c0
                androidx.lifecycle.d0<java.lang.Boolean> r3 = r3.f12234e
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r3.mo7l(r0)
                hf.e r3 = r2.f12226c0
                nd.j1 r3 = r3.f12232c
                java.lang.String r0 = r2.f12227d0
                android.content.SharedPreferences r3 = r3.m10820a()
                android.content.SharedPreferences$Editor r3 = r3.edit()
                java.lang.String r1 = "emailColonize"
                android.content.SharedPreferences$Editor r3 = r3.putString(r1, r0)
                r3.apply()
                hf.e r3 = r2.f12226c0
                nd.j1 r3 = r3.f12232c
                java.lang.String r0 = r2.f12228e0
                android.content.SharedPreferences r3 = r3.m10820a()
                android.content.SharedPreferences$Editor r3 = r3.edit()
                java.lang.String r1 = "passwordColonize"
                android.content.SharedPreferences$Editor r3 = r3.putString(r1, r0)
                r3.apply()
                hf.e r3 = r2.f12226c0
                androidx.lifecycle.d0<vg.b<java.lang.String>> r3 = r3.f12240k
                vg.b r0 = new vg.b
                java.lang.String r1 = r2.f12229f0
                r0.<init>(r1)
                r3.mo7l(r0)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.colonize.login.ColonizeMarsToolLoginViewModel$login$1$3$1", m7452f = "ColonizeMarsToolLoginViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
    /* renamed from: hf.d$b */
    public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public final /* synthetic */ p132hf.C3036e f12230c0;

        /* renamed from: d0 */
        public final /* synthetic */ java.lang.String f12231d0;

        public b(p132hf.C3036e r1, java.lang.String r2, p101fh.InterfaceC2172d<? super p132hf.C3035d.b> r3) {
                r0 = this;
                r0.f12230c0 = r1
                r0.f12231d0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                hf.d$b r3 = new hf.d$b
                hf.e r0 = r2.f12230c0
                java.lang.String r1 = r2.f12231d0
                r3.<init>(r0, r1, r4)
                return r3
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                hf.d$b r3 = new hf.d$b
                hf.e r0 = r2.f12230c0
                java.lang.String r1 = r2.f12231d0
                r3.<init>(r0, r1, r4)
                ch.l r4 = ch.C0985l.f5061a
                r3.mo123o(r4)
                return r4
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r6) {
                r5 = this;
                p074e9.C1805a.m4540y(r6)
                hf.e r6 = r5.f12230c0
                androidx.lifecycle.d0<java.lang.Boolean> r6 = r6.f12234e
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r6.mo7l(r0)
                hf.e r6 = r5.f12230c0
                androidx.lifecycle.d0<vg.b<ah.a>> r6 = r6.f12239j
                java.lang.String r0 = r5.f12231d0
                vg.b r1 = new vg.b
                ah.a r2 = new ah.a
                zg.d r3 = p458zg.EnumC7332d.f28068Z
                java.lang.String r4 = "Error"
                r2.<init>(r4, r0, r3)
                r1.<init>(r2)
                r6.mo7l(r1)
                ch.l r6 = ch.C0985l.f5061a
                return r6
        }
    }

    public C3035d(p132hf.C3036e r1, java.lang.String r2, java.lang.String r3, p101fh.InterfaceC2172d<? super p132hf.C3035d> r4) {
            r0 = this;
            r0.f12223e0 = r1
            r0.f12224f0 = r2
            r0.f12225g0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r5, p101fh.InterfaceC2172d<?> r6) {
            r4 = this;
            hf.d r0 = new hf.d
            hf.e r1 = r4.f12223e0
            java.lang.String r2 = r4.f12224f0
            java.lang.String r3 = r4.f12225g0
            r0.<init>(r1, r2, r3, r6)
            r0.f12222d0 = r5
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r5, p101fh.InterfaceC2172d<? super ch.C0985l> r6) {
            r4 = this;
            vh.b0 r5 = (p379vh.InterfaceC6686b0) r5
            fh.d r6 = (p101fh.InterfaceC2172d) r6
            hf.d r0 = new hf.d
            hf.e r1 = r4.f12223e0
            java.lang.String r2 = r4.f12224f0
            java.lang.String r3 = r4.f12225g0
            r0.<init>(r1, r2, r3, r6)
            r0.f12222d0 = r5
            ch.l r5 = ch.C0985l.f5061a
            java.lang.Object r5 = r0.mo123o(r5)
            return r5
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r12) {
            r11 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r11.f12221c0
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            p074e9.C1805a.m4540y(r12)
            goto Ld6
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            java.lang.Object r1 = r11.f12222d0
            p074e9.C1805a.m4540y(r12)
            goto L7d
        L22:
            p074e9.C1805a.m4540y(r12)     // Catch: java.lang.Throwable -> L53
            goto L4c
        L26:
            p074e9.C1805a.m4540y(r12)
            java.lang.Object r12 = r11.f12222d0
            vh.b0 r12 = (p379vh.InterfaceC6686b0) r12
            hf.e r12 = r11.f12223e0
            java.lang.String r1 = r11.f12224f0
            java.lang.String r5 = r11.f12225g0
            ch.d r12 = r12.f12233d     // Catch: java.lang.Throwable -> L53
            java.lang.Object r12 = r12.getValue()     // Catch: java.lang.Throwable -> L53
            g2.o r12 = (p105g2.C2221o) r12     // Catch: java.lang.Throwable -> L53
            java.lang.CharSequence r1 = p362uh.C6467m.m13083n0(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L53
            r11.f12221c0 = r4     // Catch: java.lang.Throwable -> L53
            java.lang.Object r12 = gf.C2338a.m6092a(r12, r1, r5, r11)     // Catch: java.lang.Throwable -> L53
            if (r12 != r0) goto L4c
            return r0
        L4c:
            if.b r12 = (p151if.C3139b) r12     // Catch: java.lang.Throwable -> L53
            java.lang.String r12 = r12.getToken()     // Catch: java.lang.Throwable -> L53
            goto L58
        L53:
            r12 = move-exception
            java.lang.Object r12 = p074e9.C1805a.m4520e(r12)
        L58:
            r1 = r12
            hf.e r6 = r11.f12223e0
            java.lang.String r7 = r11.f12224f0
            java.lang.String r8 = r11.f12225g0
            boolean r12 = r1 instanceof ch.C0979f.a
            r12 = r12 ^ r4
            if (r12 == 0) goto L7d
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            vh.z r12 = p379vh.C6716l0.f26007a
            vh.k1 r12 = p459zh.C7346l.f28106a
            hf.d$a r4 = new hf.d$a
            r10 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f12222d0 = r1
            r11.f12221c0 = r3
            java.lang.Object r12 = p101fh.C2174f.m5710A(r12, r4, r11)
            if (r12 != r0) goto L7d
            return r0
        L7d:
            hf.e r12 = r11.f12223e0
            java.lang.Throwable r3 = ch.C0979f.m2690b(r1)
            if (r3 == 0) goto Ld6
            boolean r4 = r3 instanceof p105g2.C2226t
            r5 = 0
            if (r4 == 0) goto Lc1
            g2.t r3 = (p105g2.C2226t) r3     // Catch: java.lang.Throwable -> L9a
            g2.l r3 = r3.f10175Y     // Catch: java.lang.Throwable -> L9a
            byte[] r3 = r3.f10136b     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = "this.networkResponse.data"
            p214m2.C4339q.m9705j(r3, r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = p362uh.C6463i.m13051H(r3)     // Catch: java.lang.Throwable -> L9a
            goto L9f
        L9a:
            r3 = move-exception
            java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
        L9f:
            boolean r4 = r3 instanceof ch.C0979f.a
            if (r4 == 0) goto La4
            r3 = r5
        La4:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lc1
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb4
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = "message"
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> Lb4
            goto Lb9
        Lb4:
            r3 = move-exception
            java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
        Lb9:
            boolean r4 = r3 instanceof ch.C0979f.a
            if (r4 == 0) goto Lbe
            r3 = r5
        Lbe:
            java.lang.String r3 = (java.lang.String) r3
            goto Lc2
        Lc1:
            r3 = r5
        Lc2:
            vh.z r4 = p379vh.C6716l0.f26007a
            vh.k1 r4 = p459zh.C7346l.f28106a
            hf.d$b r6 = new hf.d$b
            r6.<init>(r12, r3, r5)
            r11.f12222d0 = r1
            r11.f12221c0 = r2
            java.lang.Object r12 = p101fh.C2174f.m5710A(r4, r6, r11)
            if (r12 != r0) goto Ld6
            return r0
        Ld6:
            ch.l r12 = ch.C0985l.f5061a
            return r12
    }
}
