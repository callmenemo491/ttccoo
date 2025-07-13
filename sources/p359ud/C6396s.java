package p359ud;

/* renamed from: ud.s */
/* loaded from: classes.dex */
public final class C6396s extends td.AbstractC6216d<p171jd.C3535m> {

    /* renamed from: m1 */
    public static final p359ud.C6396s.a f24890m1 = null;

    /* renamed from: l1 */
    public final ch.InterfaceC0977d f24891l1;

    /* renamed from: ud.s$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final void m13024a(androidx.fragment.app.AbstractC0375d0 r4, id.C3130a r5) {
                r3 = this;
                java.lang.String r0 = "fragmentManager"
                p214m2.C4339q.m9706k(r4, r0)
                ud.s r0 = new ud.s
                r0.<init>()
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r2 = "contact"
                r1.putSerializable(r2, r5)
                r0.m1344x0(r1)
                r5 = 0
                r0.mo1229K0(r4, r5)
                return
        }
    }

    /* renamed from: ud.s$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<id.C3130a> {

        /* renamed from: Z */
        public final /* synthetic */ p359ud.C6396s f24892Z;

        public b(p359ud.C6396s r1) {
                r0 = this;
                r0.f24892Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public id.C3130a mo15e() {
                r3 = this;
                ud.s r0 = r3.f24892Z
                android.os.Bundle r0 = r0.f2282d0
                r1 = 0
                if (r0 == 0) goto Le
                java.lang.String r2 = "contact"
                java.io.Serializable r0 = r0.getSerializable(r2)
                goto Lf
            Le:
                r0 = r1
            Lf:
                boolean r2 = r0 instanceof id.C3130a
                if (r2 == 0) goto L16
                r1 = r0
                id.a r1 = (id.C3130a) r1
            L16:
                return r1
        }
    }

    /* renamed from: ud.s$c */
    public /* synthetic */ class c extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3535m> {

        /* renamed from: g0 */
        public static final p359ud.C6396s.c f24893g0 = null;

        static {
                ud.s$c r0 = new ud.s$c
                r0.<init>()
                p359ud.C6396s.c.f24893g0 = r0
                return
        }

        public c() {
                r6 = this;
                java.lang.Class<jd.m> r2 = p171jd.C3535m.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/EditContactDialogBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3535m mo115i(android.view.LayoutInflater r7, android.view.ViewGroup r8, java.lang.Boolean r9) {
                r6 = this;
                android.view.LayoutInflater r7 = (android.view.LayoutInflater) r7
                android.view.ViewGroup r8 = (android.view.ViewGroup) r8
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r7, r0)
                r0 = 2131558467(0x7f0d0043, float:1.874225E38)
                r1 = 0
                android.view.View r7 = r7.inflate(r0, r8, r1)
                if (r9 == 0) goto L1c
                r8.addView(r7)
            L1c:
                r8 = 2131361944(0x7f0a0098, float:1.8343655E38)
                android.view.View r9 = p064e.C1494h.m4055f(r7, r8)
                r2 = r9
                com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
                if (r2 == 0) goto L56
                r8 = 2131361960(0x7f0a00a8, float:1.8343687E38)
                android.view.View r9 = p064e.C1494h.m4055f(r7, r8)
                r3 = r9
                com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
                if (r3 == 0) goto L56
                r8 = 2131362047(0x7f0a00ff, float:1.8343864E38)
                android.view.View r9 = p064e.C1494h.m4055f(r7, r8)
                r4 = r9
                com.google.android.material.textfield.TextInputEditText r4 = (com.google.android.material.textfield.TextInputEditText) r4
                if (r4 == 0) goto L56
                r8 = 2131362764(0x7f0a03cc, float:1.8345318E38)
                android.view.View r9 = p064e.C1494h.m4055f(r7, r8)
                r5 = r9
                com.google.android.material.textfield.TextInputEditText r5 = (com.google.android.material.textfield.TextInputEditText) r5
                if (r5 == 0) goto L56
                jd.m r8 = new jd.m
                r1 = r7
                androidx.appcompat.widget.LinearLayoutCompat r1 = (androidx.appcompat.widget.LinearLayoutCompat) r1
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r8
            L56:
                android.content.res.Resources r7 = r7.getResources()
                java.lang.String r7 = r7.getResourceName(r8)
                java.lang.NullPointerException r8 = new java.lang.NullPointerException
                java.lang.String r9 = "Missing required view with ID: "
                java.lang.String r7 = r9.concat(r7)
                r8.<init>(r7)
                throw r8
        }
    }

    static {
            ud.s$a r0 = new ud.s$a
            r1 = 0
            r0.<init>(r1)
            p359ud.C6396s.f24890m1 = r0
            return
    }

    public C6396s() {
            r1 = this;
            r1.<init>()
            ud.s$b r0 = new ud.s$b
            r0.<init>(r1)
            ch.d r0 = p185k7.C4038x4.m9096i(r0)
            r1.f24891l1 = r0
            return
    }

    @Override // td.AbstractC6216d
    /* renamed from: M0 */
    public void mo6088M0() {
            r4 = this;
            T extends w1.a r0 = r4.f24171k1
            p214m2.C4339q.m9704i(r0)
            jd.m r0 = (p171jd.C3535m) r0
            com.google.android.material.textfield.TextInputEditText r1 = r0.f15331d
            id.a r2 = r4.m13023O0()
            r3 = 0
            if (r2 == 0) goto L13
            java.lang.String r2 = r2.f12558a0
            goto L14
        L13:
            r2 = r3
        L14:
            r1.setText(r2)
            com.google.android.material.textfield.TextInputEditText r1 = r0.f15332e
            id.a r2 = r4.m13023O0()
            if (r2 == 0) goto L21
            java.lang.String r3 = r2.f12557Z
        L21:
            r1.setText(r3)
            com.google.android.material.button.MaterialButton r1 = r0.f15330c
            ud.r r2 = new ud.r
            r3 = 0
            r2.<init>(r4, r3)
            r1.setOnClickListener(r2)
            com.google.android.material.button.MaterialButton r0 = r0.f15329b
            ud.r r1 = new ud.r
            r2 = 1
            r1.<init>(r4, r2)
            r0.setOnClickListener(r1)
            return
    }

    @Override // td.AbstractC6216d
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3535m> mo6089N0() {
            r2 = this;
            ud.s$c r0 = p359ud.C6396s.c.f24893g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    /* renamed from: O0 */
    public final id.C3130a m13023O0() {
            r1 = this;
            ch.d r0 = r1.f24891l1
            java.lang.Object r0 = r0.getValue()
            id.a r0 = (id.C3130a) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r2) {
            r1 = this;
            super.mo114V(r2)
            r2 = 1
            r0 = 2132017460(0x7f140134, float:1.96732E38)
            r1.m1227I0(r2, r0)
            return
    }
}
