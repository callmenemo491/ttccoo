package p078ef;

/* renamed from: ef.b */
/* loaded from: classes.dex */
public final class C1831b extends td.AbstractC6218f<p171jd.C3509f1> {

    /* renamed from: o1 */
    public static final /* synthetic */ int f7980o1 = 0;

    /* renamed from: m1 */
    public final boolean f7981m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f7982n1;

    /* renamed from: ef.b$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p078ef.C1831b f7983Z;

        public a(p078ef.C1831b r1) {
                r0 = this;
                r0.f7983Z = r1
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
                ef.b r0 = r1.f7983Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: ef.b$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p078ef.C1831b f7984Z;

        public b(p078ef.C1831b r1) {
                r0 = this;
                r0.f7984Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r15) {
                r14 = this;
                android.view.View r15 = (android.view.View) r15
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r15, r0)
                ef.b r15 = r14.f7984Z
                int r0 = p078ef.C1831b.f7980o1
                ef.f r15 = r15.m4590P0()
                ef.b r0 = r14.f7984Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r15)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                androidx.lifecycle.d0<java.util.List<od.n>> r2 = r15.f7993f
                java.lang.Object r2 = r2.m1411d()
                java.util.List r2 = (java.util.List) r2
                r3 = 10
                r4 = 0
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L76
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r2 = r2.iterator()
            L35:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto L55
                java.lang.Object r8 = r2.next()
                r9 = r8
                od.n r9 = (p255od.C5217n) r9
                double r9 = r9.getLudioToClaim()
                r11 = 0
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 <= 0) goto L4e
                r9 = 1
                goto L4f
            L4e:
                r9 = 0
            L4f:
                if (r9 == 0) goto L35
                r7.add(r8)
                goto L35
            L55:
                java.util.ArrayList r2 = new java.util.ArrayList
                int r8 = p062dh.C1469e.m3992D(r7, r3)
                r2.<init>(r8)
                java.util.Iterator r7 = r7.iterator()
            L62:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L77
                java.lang.Object r8 = r7.next()
                od.n r8 = (p255od.C5217n) r8
                java.lang.String r8 = r8.getAsset_id()
                r2.add(r8)
                goto L62
            L76:
                r2 = r4
            L77:
                if (r2 == 0) goto L82
                boolean r7 = r2.isEmpty()
                if (r7 == 0) goto L80
                goto L82
            L80:
                r7 = 0
                goto L83
            L82:
                r7 = 1
            L83:
                if (r7 == 0) goto L86
                goto Lf9
            L86:
                nd.b0 r7 = r15.f7990c
                ef.c r8 = new ef.c
                r8.<init>(r15)
                java.util.Objects.requireNonNull(r7)
                p214m2.C4339q.m9706k(r0, r1)
                java.lang.String r15 = "listAssetIds"
                p214m2.C4339q.m9706k(r2, r15)
                java.lang.String r15 = "completion"
                p214m2.C4339q.m9706k(r8, r15)
                r7.f18918n = r8
                id.b r15 = r7.m10795h()
                if (r15 != 0) goto La6
                goto Lf9
            La6:
                java.lang.String r1 = r15.f12559a
                int r8 = r1.length()
                if (r8 != 0) goto Laf
                r5 = 1
            Laf:
                if (r5 != 0) goto Lfc
                one.block.eosiojava.models.rpcProvider.Authorization r5 = new one.block.eosiojava.models.rpcProvider.Authorization
                java.lang.String r8 = r7.f18911g
                r5.<init>(r1, r8)
                java.util.ArrayList r8 = new java.util.ArrayList
                int r3 = p062dh.C1469e.m3992D(r2, r3)
                r8.<init>(r3)
                java.util.Iterator r2 = r2.iterator()
            Lc5:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto Le9
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                nd.w0 r9 = new nd.w0
                pd.d0 r10 = new pd.d0
                java.lang.String r11 = "0"
                r10.<init>(r1, r3, r11)
                java.util.List r3 = p074e9.C1805a.m4528m(r5)
                java.lang.String r11 = "clashdomedst"
                java.lang.String r12 = "claimludio"
                r9.<init>(r11, r12, r10, r3)
                r8.add(r9)
                goto Lc5
            Le9:
                b3.b r1 = new b3.b
                r1.<init>(r6)
                r1.m2207b(r8)
                nd.a r2 = p238nd.EnumC4724a.f18876f0
                r1.m2209d(r2, r5)
                r7.m10804r(r0, r15, r1, r4)
            Lf9:
                ch.l r15 = ch.C0985l.f5061a
                return r15
            Lfc:
                java.lang.Exception r15 = new java.lang.Exception
                java.lang.String r0 = "USER_NOT_SIGNED"
                r15.<init>(r0)
                throw r15
        }
    }

    /* renamed from: ef.b$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f7985Z;

        public c(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f7985Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f7985Z
                return r0
        }
    }

    /* renamed from: ef.b$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f7986Z;

        public d(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f7986Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f7986Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: ef.b$e */
    public /* synthetic */ class e extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3509f1> {

        /* renamed from: g0 */
        public static final p078ef.C1831b.e f7987g0 = null;

        static {
                ef.b$e r0 = new ef.b$e
                r0.<init>()
                p078ef.C1831b.e.f7987g0 = r0
                return
        }

        public e() {
                r6 = this;
                java.lang.Class<jd.f1> r2 = p171jd.C3509f1.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolClashdomeFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3509f1 mo115i(android.view.LayoutInflater r10, android.view.ViewGroup r11, java.lang.Boolean r12) {
                r9 = this;
                android.view.LayoutInflater r10 = (android.view.LayoutInflater) r10
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r10, r0)
                r0 = 2131558664(0x7f0d0108, float:1.874265E38)
                r1 = 0
                android.view.View r10 = r10.inflate(r0, r11, r1)
                if (r12 == 0) goto L1c
                r11.addView(r10)
            L1c:
                r11 = 2131361945(0x7f0a0099, float:1.8343657E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r2 = r12
                com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
                if (r2 == 0) goto L7c
                r11 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r3 = r12
                androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
                if (r3 == 0) goto L7c
                r11 = 2131362218(0x7f0a01aa, float:1.834421E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r4 = r12
                android.widget.GridLayout r4 = (android.widget.GridLayout) r4
                if (r4 == 0) goto L7c
                r11 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r5 = r12
                com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
                if (r5 == 0) goto L7c
                r11 = 2131362318(0x7f0a020e, float:1.8344413E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                if (r12 == 0) goto L7c
                jd.d0 r6 = p171jd.C3500d0.m7975d(r12)
                r11 = 2131362474(0x7f0a02aa, float:1.834473E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                if (r12 == 0) goto L7c
                jd.d0 r7 = p171jd.C3500d0.m7975d(r12)
                r11 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r8 = r12
                androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
                if (r8 == 0) goto L7c
                jd.f1 r11 = new jd.f1
                r1 = r10
                androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r11
            L7c:
                android.content.res.Resources r10 = r10.getResources()
                java.lang.String r10 = r10.getResourceName(r11)
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "Missing required view with ID: "
                java.lang.String r10 = r12.concat(r10)
                r11.<init>(r10)
                throw r11
        }
    }

    /* renamed from: ef.b$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p078ef.C1831b f7988Z;

        public f(p078ef.C1831b r1) {
                r0 = this;
                r0.f7988Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                ef.b r0 = r1.f7988Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C1831b() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f7981m1 = r0
            ef.b$f r0 = new ef.b$f
            r0.<init>(r4)
            ef.b$c r1 = new ef.b$c
            r1.<init>(r4)
            java.lang.Class<ef.f> r2 = p078ef.C1835f.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            ef.b$d r3 = new ef.b$d
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f7982n1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            ef.f r0 = r4.m4590P0()
            androidx.lifecycle.LiveData<ef.g> r0 = r0.f7994g
            androidx.lifecycle.v r1 = r4.m1311O()
            ef.a r2 = new ef.a
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ef.f r0 = r4.m4590P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f7996i
            androidx.lifecycle.v r1 = r4.m1311O()
            ef.a r2 = new ef.a
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ef.f r0 = r4.m4590P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f7995h
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            ef.b$a r3 = new ef.b$a
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: M0 */
    public void mo109M0() {
            r4 = this;
            T extends w1.a r0 = r4.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.f1 r0 = (p171jd.C3509f1) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15148c
            ud.a r2 = new ud.a
            r2.<init>(r4)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15151f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131951719(0x7f130067, float:1.953986E38)
            java.lang.String r3 = r4.m1309M(r3)
            r2.append(r3)
            java.lang.String r3 = " Tool"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            jd.d0 r1 = r0.f15149d
            java.lang.Object r1 = r1.f15081c
            com.google.android.material.imageview.ShapeableImageView r1 = (com.google.android.material.imageview.ShapeableImageView) r1
            java.lang.String r2 = "ludio.imageView"
            p214m2.C4339q.m9705j(r1, r2)
            java.lang.String r2 = "https://clashdome.io/images/ludio_60X60.png"
            vg.C6672m.m13521h(r1, r2)
            jd.d0 r1 = r0.f15150e
            java.lang.Object r1 = r1.f15081c
            com.google.android.material.imageview.ShapeableImageView r1 = (com.google.android.material.imageview.ShapeableImageView) r1
            java.lang.String r2 = "orcs.imageView"
            p214m2.C4339q.m9705j(r1, r2)
            java.lang.String r2 = "https://clashdome.io/images/head_orc.png"
            vg.C6672m.m13521h(r1, r2)
            jd.d0 r1 = r0.f15149d
            androidx.appcompat.widget.AppCompatTextView r1 = r1.f15083e
            java.lang.String r2 = "LUDIO"
            r1.setText(r2)
            jd.d0 r1 = r0.f15150e
            androidx.appcompat.widget.AppCompatTextView r1 = r1.f15083e
            java.lang.String r2 = "ORCS"
            r1.setText(r2)
            com.google.android.material.button.MaterialButton r0 = r0.f15147b
            java.lang.String r1 = "buttonClaim"
            p214m2.C4339q.m9705j(r0, r1)
            r1 = 0
            ef.b$b r2 = new ef.b$b
            r2.<init>(r4)
            r3 = 1
            vg.C6664e.m13509j(r0, r1, r2, r3)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3509f1> mo110N0() {
            r2 = this;
            ef.b$e r0 = p078ef.C1831b.e.f7987g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f7981m1
            return r0
    }

    /* renamed from: P0 */
    public final p078ef.C1835f m4590P0() {
            r1 = this;
            ch.d r0 = r1.f7982n1
            java.lang.Object r0 = r0.getValue()
            ef.f r0 = (p078ef.C1835f) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            ef.f r1 = r0.m4590P0()
            r1.m4591d()
            return
    }
}
