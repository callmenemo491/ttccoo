package ae;

/* renamed from: ae.c */
/* loaded from: classes.dex */
public final class C0074c extends td.AbstractC6218f<p171jd.C3576z> {

    /* renamed from: p1 */
    public static final /* synthetic */ int f209p1 = 0;

    /* renamed from: m1 */
    public final boolean f210m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f211n1;

    /* renamed from: o1 */
    public final ch.InterfaceC0977d f212o1;

    /* renamed from: ae.c$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0985l, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ae.C0074c f213Z;

        public a(ae.C0074c r1) {
                r0 = this;
                r0.f213Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(ch.C0985l r2) {
                r1 = this;
                ch.l r2 = (ch.C0985l) r2
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r2, r0)
                ae.c r2 = r1.f213Z
                ae.b r0 = new ae.b
                r0.<init>(r2)
                p458zg.C7331c.m14405d(r2, r0)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: ae.c$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ae.C0074c f214Z;

        public b(ae.C0074c r1) {
                r0 = this;
                r0.f214Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r7) {
                r6 = this;
                android.view.View r7 = (android.view.View) r7
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r7, r0)
                ae.c r7 = r6.f214Z
                androidx.fragment.app.s r7 = r7.m1330q0()
                ae.c r0 = r6.f214Z
                ce.f r0 = r0.m112P0()
                java.lang.String r0 = r0.f4958e0
                java.lang.String r1 = "url"
                p214m2.C4339q.m9706k(r0, r1)
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.String r2 = "android.intent.action.SEND"
                android.content.Intent r1 = r1.setAction(r2)
                java.lang.String r3 = r7.getPackageName()
                java.lang.String r4 = "androidx.core.app.EXTRA_CALLING_PACKAGE"
                r1.putExtra(r4, r3)
                java.lang.String r3 = r7.getPackageName()
                java.lang.String r4 = "android.support.v4.app.EXTRA_CALLING_PACKAGE"
                r1.putExtra(r4, r3)
                r3 = 524288(0x80000, float:7.34684E-40)
                r1.addFlags(r3)
                r3 = r7
            L3d:
                boolean r4 = r3 instanceof android.content.ContextWrapper
                r5 = 0
                if (r4 == 0) goto L50
                boolean r4 = r3 instanceof android.app.Activity
                if (r4 == 0) goto L49
                android.app.Activity r3 = (android.app.Activity) r3
                goto L51
            L49:
                android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
                android.content.Context r3 = r3.getBaseContext()
                goto L3d
            L50:
                r3 = r5
            L51:
                if (r3 == 0) goto L61
                android.content.ComponentName r3 = r3.getComponentName()
                java.lang.String r4 = "androidx.core.app.EXTRA_CALLING_ACTIVITY"
                r1.putExtra(r4, r3)
                java.lang.String r4 = "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
                r1.putExtra(r4, r3)
            L61:
                java.lang.String r3 = "text/plain"
                r1.setType(r3)
                java.lang.String r3 = "android.intent.extra.TEXT"
                r1.putExtra(r3, r0)
                r1.setAction(r2)
                java.lang.String r0 = "android.intent.extra.STREAM"
                r1.removeExtra(r0)
                r1.setClipData(r5)
                int r0 = r1.getFlags()
                r0 = r0 & (-2)
                r1.setFlags(r0)
                java.lang.String r0 = "Share link"
                android.content.Intent r0 = android.content.Intent.createChooser(r1, r0)
                r7.startActivity(r0)
                ch.l r7 = ch.C0985l.f5061a
                return r7
        }
    }

    /* renamed from: ae.c$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f215Z;

        public c(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f215Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f215Z
                return r0
        }
    }

    /* renamed from: ae.c$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f216Z;

        public d(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f216Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f216Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: ae.c$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p041ce.C0955f> {

        /* renamed from: Z */
        public final /* synthetic */ ae.C0074c f217Z;

        public e(ae.C0074c r1) {
                r0 = this;
                r0.f217Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p041ce.C0955f mo15e() {
                r2 = this;
                ae.c r0 = r2.f217Z
                android.os.Bundle r0 = r0.m1332r0()
                java.lang.String r1 = "transferRequest"
                java.io.Serializable r0 = r0.getSerializable(r1)
                java.lang.String r1 = "null cannot be cast to non-null type io.tacocrypto.app.ui.request.scan.TransferRequest"
                java.util.Objects.requireNonNull(r0, r1)
                ce.f r0 = (p041ce.C0955f) r0
                return r0
        }
    }

    /* renamed from: ae.c$f */
    public /* synthetic */ class f extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3576z> {

        /* renamed from: g0 */
        public static final ae.C0074c.f f218g0 = null;

        static {
                ae.c$f r0 = new ae.c$f
                r0.<init>()
                ae.C0074c.f.f218g0 = r0
                return
        }

        public f() {
                r6 = this;
                java.lang.Class<jd.z> r2 = p171jd.C3576z.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/RequestDetailFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3576z mo115i(android.view.LayoutInflater r12, android.view.ViewGroup r13, java.lang.Boolean r14) {
                r11 = this;
                android.view.LayoutInflater r12 = (android.view.LayoutInflater) r12
                android.view.ViewGroup r13 = (android.view.ViewGroup) r13
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r12, r0)
                r0 = 2131558585(0x7f0d00b9, float:1.874249E38)
                r1 = 0
                android.view.View r12 = r12.inflate(r0, r13, r1)
                if (r14 == 0) goto L1c
                r13.addView(r12)
            L1c:
                r13 = 2131361888(0x7f0a0060, float:1.8343541E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                if (r14 == 0) goto L96
                jd.j0 r2 = p171jd.C3524j0.m7994c(r14)
                r13 = 2131361963(0x7f0a00ab, float:1.8343693E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r3 = r14
                com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
                if (r3 == 0) goto L96
                r13 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r4 = r14
                androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
                if (r4 == 0) goto L96
                r13 = 2131362209(0x7f0a01a1, float:1.8344192E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                if (r14 == 0) goto L96
                jd.j0 r5 = p171jd.C3524j0.m7994c(r14)
                r13 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r6 = r14
                com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
                if (r6 == 0) goto L96
                r13 = 2131362262(0x7f0a01d6, float:1.83443E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r7 = r14
                androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
                if (r7 == 0) goto L96
                r13 = 2131362342(0x7f0a0226, float:1.8344462E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                if (r14 == 0) goto L96
                jd.j0 r8 = p171jd.C3524j0.m7994c(r14)
                r13 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r9 = r14
                androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
                if (r9 == 0) goto L96
                r13 = 2131362714(0x7f0a039a, float:1.8345216E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                if (r14 == 0) goto L96
                jd.j0 r10 = p171jd.C3524j0.m7994c(r14)
                jd.z r13 = new jd.z
                r1 = r12
                androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
                r0 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r13
            L96:
                android.content.res.Resources r12 = r12.getResources()
                java.lang.String r12 = r12.getResourceName(r13)
                java.lang.NullPointerException r13 = new java.lang.NullPointerException
                java.lang.String r14 = "Missing required view with ID: "
                java.lang.String r12 = r14.concat(r12)
                r13.<init>(r12)
                throw r13
        }
    }

    /* renamed from: ae.c$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ ae.C0074c f219Z;

        public g(ae.C0074c r1) {
                r0 = this;
                r0.f219Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                ae.c r0 = r1.f219Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C0074c() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f210m1 = r0
            ae.c$g r0 = new ae.c$g
            r0.<init>(r4)
            ae.c$c r1 = new ae.c$c
            r1.<init>(r4)
            java.lang.Class<ae.i> r2 = ae.C0080i.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            ae.c$d r3 = new ae.c$d
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f211n1 = r0
            ae.c$e r0 = new ae.c$e
            r0.<init>(r4)
            ch.d r0 = p185k7.C4038x4.m9096i(r0)
            r4.f212o1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            ae.i r0 = r4.m113Q0()
            androidx.lifecycle.LiveData<ce.f> r0 = r0.f228f
            androidx.lifecycle.v r1 = r4.m1311O()
            nd.x r2 = new nd.x
            r2.<init>(r4)
            r0.m1413f(r1, r2)
            ae.i r0 = r4.m113Q0()
            androidx.lifecycle.d0<vg.b<ch.l>> r0 = r0.f230h
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            ae.c$a r3 = new ae.c$a
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: M0 */
    public void mo109M0() {
            r11 = this;
            T extends w1.a r0 = r11.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.z r0 = (p171jd.C3576z) r0
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f15672d
            ud.a r1 = new ud.a
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            T extends w1.a r0 = r11.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.z r0 = (p171jd.C3576z) r0
            com.google.android.material.button.MaterialButton r0 = r0.f15671c
            java.lang.String r1 = "binding.buttonSend"
            p214m2.C4339q.m9705j(r0, r1)
            ae.c$b r1 = new ae.c$b
            r1.<init>(r11)
            r2 = 0
            r3 = 1
            vg.C6664e.m13509j(r0, r2, r1, r3)
            T extends w1.a r0 = r11.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.z r0 = (p171jd.C3576z) r0
            jd.j0 r0 = r0.f15670b
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15249d
            java.lang.String r1 = "amount:"
            r0.setText(r1)
            T extends w1.a r0 = r11.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.z r0 = (p171jd.C3576z) r0
            jd.j0 r0 = r0.f15673e
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15249d
            java.lang.String r1 = "from:"
            r0.setText(r1)
            T extends w1.a r0 = r11.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.z r0 = (p171jd.C3576z) r0
            jd.j0 r0 = r0.f15676h
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15249d
            java.lang.String r1 = "to:"
            r0.setText(r1)
            T extends w1.a r0 = r11.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.z r0 = (p171jd.C3576z) r0
            jd.j0 r0 = r0.f15675g
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15249d
            java.lang.String r1 = "memo:"
            r0.setText(r1)
            ce.f r0 = r11.m112P0()     // Catch: java.lang.Exception -> Lc7
            java.lang.String r4 = r0.f4958e0     // Catch: java.lang.Exception -> Lc7
            sb.a r5 = sb.EnumC6007a.f23162j0     // Catch: java.lang.Exception -> Lc7
            r6 = 400(0x190, float:5.6E-43)
            r7 = 400(0x190, float:5.6E-43)
            sb.j r3 = new sb.j     // Catch: java.lang.Exception -> Lbe sb.C6026t -> Lc5
            r3.<init>()     // Catch: java.lang.Exception -> Lbe sb.C6026t -> Lc5
            r8 = 0
            zb.b r0 = r3.mo7086d(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> Lbe sb.C6026t -> Lc5
            int r9 = r0.f27902Y     // Catch: java.lang.Exception -> Lc7
            int r10 = r0.f27903Z     // Catch: java.lang.Exception -> Lc7
            int r1 = r9 * r10
            int[] r4 = new int[r1]     // Catch: java.lang.Exception -> Lc7
            r1 = 0
        L88:
            if (r1 >= r10) goto La3
            int r3 = r1 * r9
            r5 = 0
        L8d:
            if (r5 >= r9) goto La0
            int r6 = r3 + r5
            boolean r7 = r0.m14372b(r5, r1)     // Catch: java.lang.Exception -> Lc7
            if (r7 == 0) goto L9a
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L9b
        L9a:
            r7 = -1
        L9b:
            r4[r6] = r7     // Catch: java.lang.Exception -> Lc7
            int r5 = r5 + 1
            goto L8d
        La0:
            int r1 = r1 + 1
            goto L88
        La3:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> Lc7
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r9, r10, r0)     // Catch: java.lang.Exception -> Lc7
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            r6 = r9
            r3.setPixels(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Lc7
            T extends w1.a r1 = r11.f24168k1     // Catch: java.lang.Exception -> Lc7
            p214m2.C4339q.m9704i(r1)     // Catch: java.lang.Exception -> Lc7
            jd.z r1 = (p171jd.C3576z) r1     // Catch: java.lang.Exception -> Lc7
            androidx.appcompat.widget.AppCompatImageView r1 = r1.f15674f     // Catch: java.lang.Exception -> Lc7
            r1.setImageBitmap(r0)     // Catch: java.lang.Exception -> Lc7
            goto Ldf
        Lbe:
            r0 = move-exception
            sb.t r1 = new sb.t     // Catch: java.lang.Exception -> Lc7
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lc7
            throw r1     // Catch: java.lang.Exception -> Lc7
        Lc5:
            r0 = move-exception
            throw r0     // Catch: java.lang.Exception -> Lc7
        Lc7:
            r0 = move-exception
            z9.f r1 = p452z9.C7264f.m14340a()
            java.lang.Exception r2 = new java.lang.Exception
            ce.f r3 = r11.m112P0()
            java.lang.String r3 = r3.f4958e0
            r2.<init>(r3, r0)
            r1.m14341b(r2)
            hk.a$b r1 = hk.C3053a.f12282b
            r1.mo7468b(r0)
        Ldf:
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3576z> mo110N0() {
            r2 = this;
            ae.c$f r0 = ae.C0074c.f.f218g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f210m1
            return r0
    }

    /* renamed from: P0 */
    public final p041ce.C0955f m112P0() {
            r1 = this;
            ch.d r0 = r1.f212o1
            java.lang.Object r0 = r0.getValue()
            ce.f r0 = (p041ce.C0955f) r0
            return r0
    }

    /* renamed from: Q0 */
    public final ae.C0080i m113Q0() {
            r1 = this;
            ch.d r0 = r1.f211n1
            java.lang.Object r0 = r0.getValue()
            ae.i r0 = (ae.C0080i) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r5) {
            r4 = this;
            super.mo114V(r5)
            ae.i r5 = r4.m113Q0()
            ce.f r0 = r4.m112P0()
            java.util.Objects.requireNonNull(r5)
            java.lang.String r1 = "transferRequest"
            p214m2.C4339q.m9706k(r0, r1)
            r5.f229g = r0
            androidx.lifecycle.d0<ce.f> r1 = r5.f227e
            r1.mo7l(r0)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ae.d r1 = new ae.d
            r2 = 0
            r1.<init>(r5, r2)
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.postDelayed(r1, r2)
            r5.f232j = r0
            return
    }
}
