package io.tacocrypto.app.p156ui.tools.nftwallet.detail;

/* loaded from: classes.dex */
public final class NFTDetailFragment extends td.AbstractC6215c<p171jd.C3557s1> {

    /* renamed from: c1 */
    public static final /* synthetic */ int f14429c1 = 0;

    /* renamed from: V0 */
    public final ch.InterfaceC0977d f14430V0;

    /* renamed from: W0 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f14431W0;

    /* renamed from: X0 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f14432X0;

    /* renamed from: Y0 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f14433Y0;

    /* renamed from: Z0 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f14434Z0;

    /* renamed from: a1 */
    public final p361uf.C6435d f14435a1;

    /* renamed from: b1 */
    public final androidx.navigation.C0507f f14436b1;

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$a */
    public static final class C3307a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {
        public C3307a(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* renamed from: x */
        public final void m7745x(p361uf.AbstractC6432a r7) {
                r6 = this;
                android.view.View r0 = r6.f3208a
                jd.f0 r0 = p171jd.C3508f0.m7980c(r0)
                androidx.appcompat.widget.AppCompatTextView r1 = r0.f15144c
                java.lang.String r2 = r7.mo13036a()
                r1.setText(r2)
                androidx.appcompat.widget.AppCompatTextView r1 = r0.f15145d
                java.lang.String r2 = r7.mo13037b()
                r1.setText(r2)
                boolean r1 = r7 instanceof p361uf.C6434c
                java.lang.String r2 = "valueText"
                r3 = 0
                if (r1 == 0) goto L4e
                uf.c r7 = (p361uf.C6434c) r7
                java.lang.String r7 = r7.f24981c
                if (r7 == 0) goto L3f
                androidx.appcompat.widget.LinearLayoutCompat r1 = r0.m7981d()
                uf.j r3 = new uf.j
                r4 = 0
                r3.<init>(r7, r4)
                r1.setOnClickListener(r3)
                androidx.appcompat.widget.AppCompatTextView r7 = r0.f15145d
                p214m2.C4339q.m9705j(r7, r2)
                r0 = 2131099722(0x7f06004a, float:1.7811805E38)
                vg.C6664e.m13510k(r7, r0)
                goto Lb4
            L3f:
                androidx.appcompat.widget.LinearLayoutCompat r7 = r0.m7981d()
                r7.setOnClickListener(r3)
                androidx.appcompat.widget.AppCompatTextView r7 = r0.f15145d
                r0 = -1
                r7.setTextColor(r0)
                goto Lb4
            L4e:
                boolean r1 = r7 instanceof p361uf.C6433b
                if (r1 == 0) goto Lb4
                androidx.appcompat.widget.LinearLayoutCompat r1 = r0.m7981d()
                r1.setOnClickListener(r3)
                uf.b r7 = (p361uf.C6433b) r7
                java.lang.Integer r1 = r7.f24978c
                r4 = 3
                if (r1 != 0) goto L61
                goto L6b
            L61:
                int r5 = r1.intValue()
                if (r5 != r4) goto L6b
                r1 = 2131231023(0x7f08012f, float:1.8078115E38)
                goto L78
            L6b:
                r5 = 2
                if (r1 != 0) goto L6f
                goto L7d
            L6f:
                int r1 = r1.intValue()
                if (r1 != r5) goto L7d
                r1 = 2131231024(0x7f080130, float:1.8078117E38)
            L78:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L7e
            L7d:
                r1 = r3
            L7e:
                androidx.appcompat.widget.AppCompatTextView r5 = r0.f15145d
                p214m2.C4339q.m9705j(r5, r2)
                java.lang.Integer r7 = r7.f24978c
                if (r7 != 0) goto L88
                goto L92
            L88:
                int r7 = r7.intValue()
                if (r7 != r4) goto L92
                r7 = 2131099745(0x7f060061, float:1.7811852E38)
                goto L95
            L92:
                r7 = 2131099746(0x7f060062, float:1.7811854E38)
            L95:
                vg.C6664e.m13510k(r5, r7)
                androidx.appcompat.widget.AppCompatTextView r7 = r0.f15145d
                p214m2.C4339q.m9705j(r7, r2)
                if (r1 == 0) goto Lb1
                android.content.Context r0 = r7.getContext()
                int r1 = r1.intValue()
                java.lang.Object r2 = p046d0.C1259a.f6733a
                android.graphics.drawable.Drawable r0 = p046d0.C1259a.b.m3710b(r0, r1)
                r7.setCompoundDrawablesWithIntrinsicBounds(r0, r3, r3, r3)
                goto Lb4
            Lb1:
                r7.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3)
            Lb4:
                return
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$b */
    public static final class C3308b extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {
        public C3308b(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$c */
    public static final class C3309c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment f14437Z;

        public C3309c(io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment r1) {
                r0 = this;
                r0.f14437Z = r1
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
                io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment r0 = r1.f14437Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$d */
    public static final class C3310d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0978e<? extends java.lang.String, ? extends java.lang.String>, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment f14438Z;

        public C3310d(io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment r1) {
                r0 = this;
                r0.f14438Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(ch.C0978e<? extends java.lang.String, ? extends java.lang.String> r7) {
                r6 = this;
                ch.e r7 = (ch.C0978e) r7
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r7, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment r0 = r6.f14438Z
                androidx.fragment.app.d0 r0 = r0.m1337u()
                java.lang.String r1 = "childFragmentManager"
                p214m2.C4339q.m9705j(r0, r1)
                A r1 = r7.f5050Y
                java.lang.String r1 = (java.lang.String) r1
                B r7 = r7.f5051Z
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r2 = "fragmentManager"
                p214m2.C4339q.m9706k(r0, r2)
                java.lang.String r2 = "assetId"
                p214m2.C4339q.m9706k(r1, r2)
                java.lang.String r3 = "name"
                p214m2.C4339q.m9706k(r7, r3)
                yf.b r4 = new yf.b
                r4.<init>()
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                r5.putString(r2, r1)
                r5.putString(r3, r7)
                r4.m1344x0(r5)
                r7 = 0
                r4.mo1229K0(r0, r7)
                ch.l r7 = ch.C0985l.f5061a
                return r7
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$e */
    public static final class C3311e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment f14439Z;

        public C3311e(io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment r1) {
                r0 = this;
                r0.f14439Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r6) {
                r5 = this;
                android.view.View r6 = (android.view.View) r6
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r6, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment r6 = r5.f14439Z
                int r0 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment.f14429c1
                uf.t r6 = r6.m7744H0()
                boolean r0 = r6.f25002i
                if (r0 == 0) goto L30
                androidx.lifecycle.d0<vg.b<ch.e<java.lang.String, java.lang.String>>> r0 = r6.f24997d
                vg.b r1 = new vg.b
                io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r2 = r6.m13040f()
                java.lang.String r2 = r2.f14479Y
                io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r6 = r6.m13040f()
                java.lang.String r6 = r6.f14481a0
                if (r6 != 0) goto L27
                java.lang.String r6 = "--"
            L27:
                ch.e r3 = new ch.e
                r3.<init>(r2, r6)
                r1.<init>(r3)
                goto L42
            L30:
                androidx.lifecycle.d0<vg.b<ah.a>> r0 = r6.f25015v
                vg.b r1 = new vg.b
                ah.a r6 = new ah.a
                zg.d r2 = p458zg.EnumC7332d.f28068Z
                java.lang.String r3 = "Error"
                java.lang.String r4 = "This asset is not transferable!"
                r6.<init>(r3, r4, r2)
                r1.<init>(r6)
            L42:
                r0.mo7l(r1)
                ch.l r6 = ch.C0985l.f5061a
                return r6
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$f */
    public static final class C3312f extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment f14440Z;

        public C3312f(io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment r1) {
                r0 = this;
                r0.f14440Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p003a2.C0005b r5) {
                r4 = this;
                a2.b r5 = (p003a2.C0005b) r5
                java.lang.String r0 = "$this$setup"
                p214m2.C4339q.m9706k(r5, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment r0 = r4.f14440Z
                b2.a<java.lang.Object> r0 = r0.f14431W0
                r5.m14b(r0)
                java.lang.Class<uf.c> r0 = p361uf.C6434c.class
                java.lang.String r0 = r0.getName()
                e2.d r1 = new e2.d
                r1.<init>(r5, r0)
                java.lang.String r0 = "$this$withItem"
                p214m2.C4339q.m9706k(r1, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.a r2 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3321a.f14449g0
                io.tacocrypto.app.ui.tools.nftwallet.detail.b r3 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3322b.f14450Z
                r1.mo12c(r2, r3)
                r2 = 2131558611(0x7f0d00d3, float:1.8742543E38)
                r5.m13a(r2, r1)
                java.lang.Class<uf.b> r1 = p361uf.C6433b.class
                java.lang.String r1 = r1.getName()
                e2.d r3 = new e2.d
                r3.<init>(r5, r1)
                p214m2.C4339q.m9706k(r3, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.c r0 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3323c.f14451g0
                io.tacocrypto.app.ui.tools.nftwallet.detail.d r1 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3324d.f14452Z
                r3.mo12c(r0, r1)
                r5.m13a(r2, r3)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$g */
    public static final class C3313g extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment f14441Z;

        public C3313g(io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment r1) {
                r0 = this;
                r0.f14441Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p003a2.C0005b r5) {
                r4 = this;
                a2.b r5 = (p003a2.C0005b) r5
                java.lang.String r0 = "$this$setup"
                p214m2.C4339q.m9706k(r5, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment r0 = r4.f14441Z
                b2.a<java.lang.Object> r0 = r0.f14432X0
                r5.m14b(r0)
                java.lang.Class<uf.c> r0 = p361uf.C6434c.class
                java.lang.String r0 = r0.getName()
                e2.d r1 = new e2.d
                r1.<init>(r5, r0)
                java.lang.String r0 = "$this$withItem"
                p214m2.C4339q.m9706k(r1, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.e r2 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3325e.f14453g0
                io.tacocrypto.app.ui.tools.nftwallet.detail.f r3 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3326f.f14454Z
                r1.mo12c(r2, r3)
                r2 = 2131558611(0x7f0d00d3, float:1.8742543E38)
                r5.m13a(r2, r1)
                java.lang.Class<uf.b> r1 = p361uf.C6433b.class
                java.lang.String r1 = r1.getName()
                e2.d r3 = new e2.d
                r3.<init>(r5, r1)
                p214m2.C4339q.m9706k(r3, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.g r0 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3327g.f14455g0
                io.tacocrypto.app.ui.tools.nftwallet.detail.h r1 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3328h.f14456Z
                r3.mo12c(r0, r1)
                r5.m13a(r2, r3)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$h */
    public static final class C3314h extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment f14442Z;

        public C3314h(io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment r1) {
                r0 = this;
                r0.f14442Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p003a2.C0005b r5) {
                r4 = this;
                a2.b r5 = (p003a2.C0005b) r5
                java.lang.String r0 = "$this$setup"
                p214m2.C4339q.m9706k(r5, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment r0 = r4.f14442Z
                b2.a<java.lang.Object> r0 = r0.f14433Y0
                r5.m14b(r0)
                java.lang.Class<uf.c> r0 = p361uf.C6434c.class
                java.lang.String r0 = r0.getName()
                e2.d r1 = new e2.d
                r1.<init>(r5, r0)
                java.lang.String r0 = "$this$withItem"
                p214m2.C4339q.m9706k(r1, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.i r2 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3329i.f14457g0
                io.tacocrypto.app.ui.tools.nftwallet.detail.j r3 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3330j.f14458Z
                r1.mo12c(r2, r3)
                r2 = 2131558611(0x7f0d00d3, float:1.8742543E38)
                r5.m13a(r2, r1)
                java.lang.Class<uf.b> r1 = p361uf.C6433b.class
                java.lang.String r1 = r1.getName()
                e2.d r3 = new e2.d
                r3.<init>(r5, r1)
                p214m2.C4339q.m9706k(r3, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.k r0 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3331k.f14459g0
                io.tacocrypto.app.ui.tools.nftwallet.detail.l r1 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3332l.f14460Z
                r3.mo12c(r0, r1)
                r5.m13a(r2, r3)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$i */
    public static final class C3315i extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment f14443Z;

        public C3315i(io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment r1) {
                r0 = this;
                r0.f14443Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p003a2.C0005b r5) {
                r4 = this;
                a2.b r5 = (p003a2.C0005b) r5
                java.lang.String r0 = "$this$setup"
                p214m2.C4339q.m9706k(r5, r0)
                io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment r0 = r4.f14443Z
                b2.a<java.lang.Object> r0 = r0.f14434Z0
                r5.m14b(r0)
                r0 = 2131558613(0x7f0d00d5, float:1.8742547E38)
                java.lang.Class<xf.w> r1 = p417xf.C7069w.class
                java.lang.String r1 = r1.getName()
                e2.d r2 = new e2.d
                r2.<init>(r5, r1)
                java.lang.String r1 = "$this$withItem"
                p214m2.C4339q.m9706k(r2, r1)
                io.tacocrypto.app.ui.tools.nftwallet.detail.m r1 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3333m.f14461g0
                io.tacocrypto.app.ui.tools.nftwallet.detail.n r3 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3334n.f14462Z
                r2.mo12c(r1, r3)
                r5.m13a(r0, r2)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$j */
    public static final class C3316j extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<android.os.Bundle> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f14444Z;

        public C3316j(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f14444Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public android.os.Bundle mo15e() {
                r3 = this;
                androidx.fragment.app.n r0 = r3.f14444Z
                android.os.Bundle r0 = r0.f2282d0
                if (r0 == 0) goto L7
                return r0
            L7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Fragment "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                androidx.fragment.app.n r2 = r3.f14444Z
                r1.append(r2)
                java.lang.String r2 = " has null arguments"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$k */
    public static final class C3317k extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f14445Z;

        public C3317k(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f14445Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f14445Z
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$l */
    public static final class C3318l extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f14446Z;

        public C3318l(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f14446Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f14446Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$m */
    public /* synthetic */ class C3319m extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3557s1> {

        /* renamed from: g0 */
        public static final io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment.C3319m f14447g0 = null;

        static {
                io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$m r0 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$m
                r0.<init>()
                io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment.C3319m.f14447g0 = r0
                return
        }

        public C3319m() {
                r6 = this;
                java.lang.Class<jd.s1> r2 = p171jd.C3557s1.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolNftDetailFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3557s1 mo115i(android.view.LayoutInflater r23, android.view.ViewGroup r24, java.lang.Boolean r25) {
                r22 = this;
                r0 = r23
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                r1 = r24
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = r25
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                java.lang.String r3 = "p0"
                p214m2.C4339q.m9706k(r0, r3)
                r3 = 2131558675(0x7f0d0113, float:1.8742673E38)
                r4 = 0
                android.view.View r0 = r0.inflate(r3, r1, r4)
                if (r2 == 0) goto L22
                r1.addView(r0)
            L22:
                r1 = 2131361902(0x7f0a006e, float:1.834357E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r5 = r2
                androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
                if (r5 == 0) goto Lfe
                r1 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r6 = r2
                androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
                if (r6 == 0) goto Lfe
                r1 = 2131361999(0x7f0a00cf, float:1.8343766E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r7 = r2
                androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
                if (r7 == 0) goto Lfe
                r1 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r8 = r2
                android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
                if (r8 == 0) goto Lfe
                r1 = 2131362269(0x7f0a01dd, float:1.8344314E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r9 = r2
                androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
                if (r9 == 0) goto Lfe
                r1 = 2131362301(0x7f0a01fd, float:1.8344379E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r10 = r2
                androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
                if (r10 == 0) goto Lfe
                r1 = 2131362304(0x7f0a0200, float:1.8344385E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r11 = r2
                androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
                if (r11 == 0) goto Lfe
                r1 = 2131362305(0x7f0a0201, float:1.8344387E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r12 = r2
                androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
                if (r12 == 0) goto Lfe
                r1 = 2131362306(0x7f0a0202, float:1.8344389E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r13 = r2
                androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
                if (r13 == 0) goto Lfe
                r1 = 2131362438(0x7f0a0286, float:1.8344657E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r14 = r2
                androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
                if (r14 == 0) goto Lfe
                r1 = 2131362458(0x7f0a029a, float:1.8344697E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r15 = r2
                androidx.core.widget.NestedScrollView r15 = (androidx.core.widget.NestedScrollView) r15
                if (r15 == 0) goto Lfe
                r1 = 2131362646(0x7f0a0356, float:1.8345078E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r16 = r2
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r16 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r16
                if (r16 == 0) goto Lfe
                r1 = 2131362648(0x7f0a0358, float:1.8345083E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r17 = r2
                com.google.android.material.tabs.TabLayout r17 = (com.google.android.material.tabs.TabLayout) r17
                if (r17 == 0) goto Lfe
                r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r18 = r2
                androidx.appcompat.widget.AppCompatTextView r18 = (androidx.appcompat.widget.AppCompatTextView) r18
                if (r18 == 0) goto Lfe
                r1 = 2131362731(0x7f0a03ab, float:1.834525E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r19 = r2
                androidx.appcompat.widget.AppCompatImageView r19 = (androidx.appcompat.widget.AppCompatImageView) r19
                if (r19 == 0) goto Lfe
                r1 = 2131362732(0x7f0a03ac, float:1.8345253E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r20 = r2
                androidx.appcompat.widget.AppCompatTextView r20 = (androidx.appcompat.widget.AppCompatTextView) r20
                if (r20 == 0) goto Lfe
                r1 = 2131362753(0x7f0a03c1, float:1.8345295E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r21 = r2
                androidx.viewpager2.widget.ViewPager2 r21 = (androidx.viewpager2.widget.ViewPager2) r21
                if (r21 == 0) goto Lfe
                jd.s1 r1 = new jd.s1
                r3 = r1
                r4 = r0
                androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return r1
            Lfe:
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r0 = r0.getResourceName(r1)
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "Missing required view with ID: "
                java.lang.String r0 = r2.concat(r0)
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$n */
    public static final class C3320n extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment f14448Z;

        public C3320n(io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment r1) {
                r0 = this;
                r0.f14448Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment r0 = r1.f14448Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public NFTDetailFragment() {
            r4 = this;
            r4.<init>()
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$n r0 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$n
            r0.<init>(r4)
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$k r1 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$k
            r1.<init>(r4)
            java.lang.Class<uf.t> r2 = p361uf.C6451t.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$l r3 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$l
            r3.<init>(r1)
            androidx.lifecycle.o0 r1 = new androidx.lifecycle.o0
            r1.<init>(r2, r3, r0)
            r4.f14430V0 = r1
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f14431W0 = r0
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f14432X0 = r0
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f14433Y0 = r0
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f14434Z0 = r0
            uf.d r0 = new uf.d
            r0.<init>()
            r4.f14435a1 = r0
            androidx.navigation.f r0 = new androidx.navigation.f
            java.lang.Class<uf.k> r1 = p361uf.C6442k.class
            sh.b r1 = p239nh.C4838r.m10853a(r1)
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$j r2 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$j
            r2.<init>(r4)
            r0.<init>(r1, r2)
            r4.f14436b1 = r0
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: D0 */
    public void mo7720D0() {
            r4 = this;
            uf.t r0 = r4.m7744H0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f24999f
            androidx.lifecycle.v r1 = r4.m1311O()
            uf.i r2 = new uf.i
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            uf.t r0 = r4.m7744H0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f25001h
            androidx.lifecycle.v r1 = r4.m1311O()
            uf.i r2 = new uf.i
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            uf.t r0 = r4.m7744H0()
            androidx.lifecycle.LiveData<java.lang.String> r0 = r0.f25004k
            androidx.lifecycle.v r1 = r4.m1311O()
            uf.i r2 = new uf.i
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            uf.t r0 = r4.m7744H0()
            androidx.lifecycle.LiveData<java.util.List<uf.a>> r0 = r0.f25008o
            androidx.lifecycle.v r1 = r4.m1311O()
            uf.i r2 = new uf.i
            r3 = 3
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            uf.t r0 = r4.m7744H0()
            androidx.lifecycle.LiveData<java.util.List<uf.a>> r0 = r0.f25010q
            androidx.lifecycle.v r1 = r4.m1311O()
            uf.i r2 = new uf.i
            r3 = 4
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            uf.t r0 = r4.m7744H0()
            androidx.lifecycle.LiveData<java.util.List<uf.a>> r0 = r0.f25012s
            androidx.lifecycle.v r1 = r4.m1311O()
            uf.i r2 = new uf.i
            r3 = 5
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            uf.t r0 = r4.m7744H0()
            androidx.lifecycle.LiveData<java.util.List<xf.w>> r0 = r0.f25014u
            androidx.lifecycle.v r1 = r4.m1311O()
            uf.i r2 = new uf.i
            r3 = 6
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            uf.t r0 = r4.m7744H0()
            androidx.lifecycle.LiveData<java.util.List<ch.e<java.lang.String, io.tacocrypto.app.ui.tools.nftwallet.detail.o>>> r0 = r0.f25006m
            androidx.lifecycle.v r1 = r4.m1311O()
            uf.i r2 = new uf.i
            r3 = 7
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            uf.t r0 = r4.m7744H0()
            androidx.lifecycle.d0<vg.b<ch.e<java.lang.String, java.lang.String>>> r0 = r0.f24997d
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$d r3 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$d
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            uf.t r0 = r4.m7744H0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f25015v
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$c r3 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$c
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: F0 */
    public void mo7721F0() {
            r6 = this;
            T extends w1.a r0 = r6.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.s1 r0 = (p171jd.C3557s1) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15520c
            ud.a r2 = new ud.a
            r2.<init>(r6)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15529l
            java.lang.String r2 = "transferIcon"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$e r2 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$e
            r2.<init>(r6)
            r3 = 0
            r4 = 1
            vg.C6664e.m13509j(r1, r3, r2, r4)
            T extends w1.a r1 = r6.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.s1 r1 = (p171jd.C3557s1) r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r1.f15527j
            of.e r2 = new of.e
            r2.<init>(r6)
            r1.setOnRefreshListener(r2)
            T extends w1.a r1 = r6.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.s1 r1 = (p171jd.C3557s1) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15522e
            java.lang.String r2 = "binding.listImmutable"
            p214m2.C4339q.m9705j(r1, r2)
            androidx.recyclerview.widget.p r3 = new androidx.recyclerview.widget.p
            android.content.Context r5 = r1.getContext()
            r3.<init>(r5, r4)
            r1.m1754g(r3)
            T extends w1.a r1 = r6.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.s1 r1 = (p171jd.C3557s1) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15524g
            java.lang.String r3 = "binding.listTemplate"
            p214m2.C4339q.m9705j(r1, r3)
            vg.C6664e.m13500a(r1)
            T extends w1.a r1 = r6.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.s1 r1 = (p171jd.C3557s1) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15522e
            p214m2.C4339q.m9705j(r1, r2)
            vg.C6664e.m13500a(r1)
            T extends w1.a r1 = r6.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.s1 r1 = (p171jd.C3557s1) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15523f
            java.lang.String r4 = "binding.listMutable"
            p214m2.C4339q.m9705j(r1, r4)
            vg.C6664e.m13500a(r1)
            T extends w1.a r1 = r6.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.s1 r1 = (p171jd.C3557s1) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15525h
            java.lang.String r5 = "binding.listTransfer"
            p214m2.C4339q.m9705j(r1, r5)
            vg.C6664e.m13500a(r1)
            T extends w1.a r1 = r6.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.s1 r1 = (p171jd.C3557s1) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15524g
            p214m2.C4339q.m9705j(r1, r3)
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$f r3 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$f
            r3.<init>(r6)
            p064e.C1487a.m4032j(r1, r3)
            T extends w1.a r1 = r6.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.s1 r1 = (p171jd.C3557s1) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15522e
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$g r2 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$g
            r2.<init>(r6)
            p064e.C1487a.m4032j(r1, r2)
            T extends w1.a r1 = r6.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.s1 r1 = (p171jd.C3557s1) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15523f
            p214m2.C4339q.m9705j(r1, r4)
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$h r2 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$h
            r2.<init>(r6)
            p064e.C1487a.m4032j(r1, r2)
            T extends w1.a r1 = r6.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.s1 r1 = (p171jd.C3557s1) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15525h
            p214m2.C4339q.m9705j(r1, r5)
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$i r2 = new io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$i
            r2.<init>(r6)
            p064e.C1487a.m4032j(r1, r2)
            androidx.viewpager2.widget.ViewPager2 r1 = r0.f15531n
            uf.d r2 = r6.f14435a1
            r1.setAdapter(r2)
            com.google.android.material.tabs.c r1 = new com.google.android.material.tabs.c
            com.google.android.material.tabs.TabLayout r2 = r0.f15528k
            androidx.viewpager2.widget.ViewPager2 r0 = r0.f15531n
            k1.c r3 = p179k1.C3644c.f16102x0
            r1.<init>(r2, r0, r3)
            r1.m3539a()
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: G0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3557s1> mo7722G0() {
            r2 = this;
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$m r0 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment.C3319m.f14447g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    /* renamed from: H0 */
    public final p361uf.C6451t m7744H0() {
            r1 = this;
            ch.d r0 = r1.f14430V0
            java.lang.Object r0 = r0.getValue()
            uf.t r0 = (p361uf.C6451t) r0
            return r0
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r3) {
            r2 = this;
            super.mo114V(r3)
            uf.t r3 = r2.m7744H0()
            androidx.navigation.f r0 = r2.f14436b1
            java.lang.Object r0 = r0.getValue()
            uf.k r0 = (p361uf.C6442k) r0
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r0 = r0.f24991a
            java.util.Objects.requireNonNull(r3)
            java.lang.String r1 = "NFTAssetUI"
            p214m2.C4339q.m9706k(r0, r1)
            java.lang.String r1 = "<set-?>"
            p214m2.C4339q.m9706k(r0, r1)
            r3.f25016w = r0
            androidx.lifecycle.d0<java.lang.String> r1 = r3.f25003j
            java.lang.String r0 = r0.f14481a0
            if (r0 != 0) goto L28
            java.lang.String r0 = "--"
        L28:
            r1.mo7l(r0)
            r3.m13041g()
            return
    }
}
