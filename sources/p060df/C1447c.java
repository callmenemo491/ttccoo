package p060df;

/* renamed from: df.c */
/* loaded from: classes.dex */
public final class C1447c extends td.AbstractC6218f<p171jd.C3505e1> {

    /* renamed from: o1 */
    public static final /* synthetic */ int f7174o1 = 0;

    /* renamed from: m1 */
    public final boolean f7175m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f7176n1;

    /* renamed from: df.c$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p060df.C1447c f7177Z;

        public a(p060df.C1447c r1) {
                r0 = this;
                r0.f7177Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p013ah.C0100a r2) {
                r1 = this;
                ah.a r2 = (p013ah.C0100a) r2
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r2, r0)
                df.c r0 = r1.f7177Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: df.c$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p060df.C1447c f7178Z;

        public b(p060df.C1447c r1) {
                r0 = this;
                r0.f7178Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r14) {
                r13 = this;
                android.view.View r14 = (android.view.View) r14
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r14, r0)
                df.c r14 = r13.f7178Z
                int r0 = p060df.C1447c.f7174o1
                df.g r14 = r14.m3975P0()
                df.c r0 = r13.f7178Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r14)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                androidx.lifecycle.d0<df.a> r2 = r14.f7187e
                java.lang.Object r2 = r2.m1411d()
                df.a r2 = (p060df.C1445a) r2
                r3 = 0
                if (r2 == 0) goto L51
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                double r5 = r2.f7169d
                r7 = 0
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 <= 0) goto L3a
                df.h r5 = p060df.EnumC1452h.f7192Z
                r4.add(r5)
            L3a:
                double r5 = r2.f7170e
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 <= 0) goto L45
                df.h r5 = p060df.EnumC1452h.f7193a0
                r4.add(r5)
            L45:
                double r5 = r2.f7171f
                int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r2 <= 0) goto L52
                df.h r2 = p060df.EnumC1452h.f7194b0
                r4.add(r2)
                goto L52
            L51:
                r4 = r3
            L52:
                r2 = 0
                r5 = 1
                if (r4 == 0) goto L5f
                boolean r6 = r4.isEmpty()
                if (r6 == 0) goto L5d
                goto L5f
            L5d:
                r6 = 0
                goto L60
            L5f:
                r6 = 1
            L60:
                if (r6 == 0) goto L64
                goto Ld9
            L64:
                nd.b0 r6 = r14.f7185c
                df.d r7 = new df.d
                r7.<init>(r14)
                java.util.Objects.requireNonNull(r6)
                p214m2.C4339q.m9706k(r0, r1)
                java.lang.String r14 = "listSchema"
                p214m2.C4339q.m9706k(r4, r14)
                java.lang.String r14 = "completion"
                p214m2.C4339q.m9706k(r7, r14)
                r6.f18918n = r7
                id.b r14 = r6.m10795h()
                if (r14 != 0) goto L84
                goto Ld9
            L84:
                java.lang.String r1 = r14.f12559a
                int r7 = r1.length()
                if (r7 != 0) goto L8d
                r2 = 1
            L8d:
                if (r2 != 0) goto Ldc
                one.block.eosiojava.models.rpcProvider.Authorization r2 = new one.block.eosiojava.models.rpcProvider.Authorization
                java.lang.String r7 = r6.f18911g
                r2.<init>(r1, r7)
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 10
                int r8 = p062dh.C1469e.m3992D(r4, r8)
                r7.<init>(r8)
                java.util.Iterator r4 = r4.iterator()
            La5:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto Lc9
                java.lang.Object r8 = r4.next()
                df.h r8 = (p060df.EnumC1452h) r8
                nd.w0 r9 = new nd.w0
                pd.b0 r10 = new pd.b0
                java.lang.String r8 = r8.f7196Y
                r10.<init>(r1, r8)
                java.util.List r8 = p074e9.C1805a.m4528m(r2)
                java.lang.String r11 = "yard.century"
                java.lang.String r12 = "claim"
                r9.<init>(r11, r12, r10, r8)
                r7.add(r9)
                goto La5
            Lc9:
                b3.b r1 = new b3.b
                r1.<init>(r5)
                r1.m2207b(r7)
                nd.a r4 = p238nd.EnumC4724a.f18875e0
                r1.m2209d(r4, r2)
                r6.m10804r(r0, r14, r1, r3)
            Ld9:
                ch.l r14 = ch.C0985l.f5061a
                return r14
            Ldc:
                java.lang.Exception r14 = new java.lang.Exception
                java.lang.String r0 = "USER_NOT_SIGNED"
                r14.<init>(r0)
                throw r14
        }
    }

    /* renamed from: df.c$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f7179Z;

        public c(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f7179Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f7179Z
                return r0
        }
    }

    /* renamed from: df.c$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f7180Z;

        public d(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f7180Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f7180Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: df.c$e */
    public /* synthetic */ class e extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3505e1> {

        /* renamed from: g0 */
        public static final p060df.C1447c.e f7181g0 = null;

        static {
                df.c$e r0 = new df.c$e
                r0.<init>()
                p060df.C1447c.e.f7181g0 = r0
                return
        }

        public e() {
                r6 = this;
                java.lang.Class<jd.e1> r2 = p171jd.C3505e1.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolCenturytrainFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3505e1 mo115i(android.view.LayoutInflater r13, android.view.ViewGroup r14, java.lang.Boolean r15) {
                r12 = this;
                android.view.LayoutInflater r13 = (android.view.LayoutInflater) r13
                android.view.ViewGroup r14 = (android.view.ViewGroup) r14
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r13, r0)
                r0 = 2131558663(0x7f0d0107, float:1.8742648E38)
                r1 = 0
                android.view.View r13 = r13.inflate(r0, r14, r1)
                if (r15 == 0) goto L1c
                r14.addView(r13)
            L1c:
                r14 = 2131361945(0x7f0a0099, float:1.8343657E38)
                android.view.View r15 = p064e.C1494h.m4055f(r13, r14)
                r2 = r15
                com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
                if (r2 == 0) goto L9e
                r14 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r15 = p064e.C1494h.m4055f(r13, r14)
                r3 = r15
                androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
                if (r3 == 0) goto L9e
                r14 = 2131362044(0x7f0a00fc, float:1.8343857E38)
                android.view.View r15 = p064e.C1494h.m4055f(r13, r14)
                r4 = r15
                androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
                if (r4 == 0) goto L9e
                r14 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r15 = p064e.C1494h.m4055f(r13, r14)
                r5 = r15
                com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
                if (r5 == 0) goto L9e
                r14 = 2131362258(0x7f0a01d2, float:1.8344292E38)
                android.view.View r15 = p064e.C1494h.m4055f(r13, r14)
                r6 = r15
                com.google.android.material.imageview.ShapeableImageView r6 = (com.google.android.material.imageview.ShapeableImageView) r6
                if (r6 == 0) goto L9e
                r14 = 2131362312(0x7f0a0208, float:1.8344401E38)
                android.view.View r15 = p064e.C1494h.m4055f(r13, r14)
                r7 = r15
                androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
                if (r7 == 0) goto L9e
                r14 = 2131362515(0x7f0a02d3, float:1.8344813E38)
                android.view.View r15 = p064e.C1494h.m4055f(r13, r14)
                r8 = r15
                androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
                if (r8 == 0) goto L9e
                r14 = 2131362706(0x7f0a0392, float:1.83452E38)
                android.view.View r15 = p064e.C1494h.m4055f(r13, r14)
                r9 = r15
                androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
                if (r9 == 0) goto L9e
                r14 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r15 = p064e.C1494h.m4055f(r13, r14)
                r10 = r15
                androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
                if (r10 == 0) goto L9e
                r14 = 2131362749(0x7f0a03bd, float:1.8345287E38)
                android.view.View r15 = p064e.C1494h.m4055f(r13, r14)
                r11 = r15
                androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
                if (r11 == 0) goto L9e
                jd.e1 r14 = new jd.e1
                r1 = r13
                androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
                r0 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r14
            L9e:
                android.content.res.Resources r13 = r13.getResources()
                java.lang.String r13 = r13.getResourceName(r14)
                java.lang.NullPointerException r14 = new java.lang.NullPointerException
                java.lang.String r15 = "Missing required view with ID: "
                java.lang.String r13 = r15.concat(r13)
                r14.<init>(r13)
                throw r14
        }
    }

    /* renamed from: df.c$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p060df.C1447c f7182Z;

        public f(p060df.C1447c r1) {
                r0 = this;
                r0.f7182Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                df.c r0 = r1.f7182Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C1447c() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f7175m1 = r0
            df.c$f r0 = new df.c$f
            r0.<init>(r4)
            df.c$c r1 = new df.c$c
            r1.<init>(r4)
            java.lang.Class<df.g> r2 = p060df.C1451g.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            df.c$d r3 = new df.c$d
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f7176n1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            df.g r0 = r4.m3975P0()
            androidx.lifecycle.LiveData<df.a> r0 = r0.f7188f
            androidx.lifecycle.v r1 = r4.m1311O()
            df.b r2 = new df.b
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            df.g r0 = r4.m3975P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f7190h
            androidx.lifecycle.v r1 = r4.m1311O()
            df.b r2 = new df.b
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            df.g r0 = r4.m3975P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f7189g
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            df.c$a r3 = new df.c$a
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: M0 */
    public void mo109M0() {
            r5 = this;
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.e1 r0 = (p171jd.C3505e1) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15115c
            ud.a r2 = new ud.a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15120h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14340g0
            java.lang.String r4 = " Tool"
            p206le.C4271b.m9585a(r3, r2, r4, r1)
            com.google.android.material.imageview.ShapeableImageView r1 = r0.f15117e
            java.lang.String r2 = "imageToken"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.a r2 = io.tacocrypto.app.EnumC3199a.f14218c0
            java.lang.String r2 = p097fd.C2139a.m5697a(r2)
            vg.C6672m.m13521h(r1, r2)
            com.google.android.material.button.MaterialButton r0 = r0.f15114b
            java.lang.String r1 = "buttonClaim"
            p214m2.C4339q.m9705j(r0, r1)
            r1 = 0
            df.c$b r2 = new df.c$b
            r2.<init>(r5)
            r3 = 1
            vg.C6664e.m13509j(r0, r1, r2, r3)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3505e1> mo110N0() {
            r2 = this;
            df.c$e r0 = p060df.C1447c.e.f7181g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f7175m1
            return r0
    }

    /* renamed from: P0 */
    public final p060df.C1451g m3975P0() {
            r1 = this;
            ch.d r0 = r1.f7176n1
            java.lang.Object r0 = r0.getValue()
            df.g r0 = (p060df.C1451g) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            df.g r1 = r0.m3975P0()
            r1.m3976d()
            return
    }
}
