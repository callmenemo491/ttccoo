package io.tacocrypto.app.p156ui.secret;

/* loaded from: classes.dex */
public final class SecretFragment extends td.AbstractC6215c<p171jd.C3549q> implements ee.InterfaceC1823a {

    /* renamed from: X0 */
    public static final /* synthetic */ int f14309X0 = 0;

    /* renamed from: V0 */
    public final ch.InterfaceC0977d f14310V0;

    /* renamed from: W0 */
    public final de.C1431a f14311W0;

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$a */
    public static final class C3234a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<de.C1444n, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14312Z;

        public C3234a(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14312Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(de.C1444n r7) {
                r6 = this;
                de.n r7 = (de.C1444n) r7
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r7, r0)
                io.tacocrypto.app.ui.secret.SecretFragment r0 = r6.f14312Z
                int r1 = io.tacocrypto.app.p156ui.secret.SecretFragment.f14309X0
                de.l r0 = r0.m7730H0()
                java.util.Objects.requireNonNull(r0)
                java.lang.String r1 = "item"
                p214m2.C4339q.m9706k(r7, r1)
                nd.b0 r1 = r0.f7134c
                id.b r1 = r1.m10795h()
                if (r1 != 0) goto L21
                goto L89
            L21:
                io.tacocrypto.app.ui.secret.b r1 = r7.f7164b
                io.tacocrypto.app.ui.secret.b r2 = io.tacocrypto.app.p156ui.secret.EnumC3250b.f14328Y
                if (r1 != r2) goto L7b
                io.tacocrypto.app.ui.secret.c r7 = r7.f7163a
                io.tacocrypto.app.ui.secret.c r1 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14342i0
                if (r7 == r1) goto L35
                androidx.lifecycle.d0<vg.b<io.tacocrypto.app.ui.secret.c>> r0 = r0.f7141j
                vg.b r1 = new vg.b
                r1.<init>(r7)
                goto L86
            L35:
                androidx.lifecycle.d0<vg.b<java.lang.Boolean>> r7 = r0.f7142k
                vg.b r1 = new vg.b
                nd.j1 r0 = r0.f7135d
                android.content.SharedPreferences r2 = r0.m10820a()
                r3 = 0
                java.lang.String r4 = "emailColonize"
                java.lang.String r2 = r2.getString(r4, r3)
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L53
                boolean r2 = p362uh.C6463i.m13054K(r2)
                if (r2 == 0) goto L51
                goto L53
            L51:
                r2 = 0
                goto L54
            L53:
                r2 = 1
            L54:
                if (r2 != 0) goto L6f
                android.content.SharedPreferences r0 = r0.m10820a()
                java.lang.String r2 = "passwordColonize"
                java.lang.String r0 = r0.getString(r2, r3)
                if (r0 == 0) goto L6b
                boolean r0 = p362uh.C6463i.m13054K(r0)
                if (r0 == 0) goto L69
                goto L6b
            L69:
                r0 = 0
                goto L6c
            L6b:
                r0 = 1
            L6c:
                if (r0 != 0) goto L6f
                goto L70
            L6f:
                r4 = 0
            L70:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                r1.<init>(r0)
                r7.mo7l(r1)
                goto L89
            L7b:
                io.tacocrypto.app.ui.secret.b r2 = io.tacocrypto.app.p156ui.secret.EnumC3250b.f14329Z
                if (r1 != r2) goto L89
                androidx.lifecycle.d0<vg.b<de.n>> r0 = r0.f7144m
                vg.b r1 = new vg.b
                r1.<init>(r7)
            L86:
                r0.mo7l(r1)
            L89:
                ch.l r7 = ch.C0985l.f5061a
                return r7
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$b */
    public static final class C3235b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<de.C1444n, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14313Z;

        public C3235b(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14313Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(de.C1444n r3) {
                r2 = this;
                de.n r3 = (de.C1444n) r3
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r3, r0)
                io.tacocrypto.app.ui.secret.SecretFragment r0 = r2.f14313Z
                int r1 = io.tacocrypto.app.p156ui.secret.SecretFragment.f14309X0
                de.l r0 = r0.m7730H0()
                java.util.Objects.requireNonNull(r0)
                java.lang.String r1 = "item"
                p214m2.C4339q.m9706k(r3, r1)
                androidx.lifecycle.d0<vg.b<de.n>> r0 = r0.f7145n
                vg.b r1 = new vg.b
                r1.<init>(r3)
                r0.mo7l(r1)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$c */
    public static final class C3236c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<de.C1444n, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14314Z;

        public C3236c(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14314Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(de.C1444n r3) {
                r2 = this;
                de.n r3 = (de.C1444n) r3
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r3, r0)
                io.tacocrypto.app.ui.secret.SecretFragment r0 = r2.f14314Z
                int r1 = io.tacocrypto.app.p156ui.secret.SecretFragment.f14309X0
                java.util.Objects.requireNonNull(r0)
                de.e r1 = new de.e
                r1.<init>(r3, r0)
                p458zg.C7331c.m14405d(r0, r1)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$d */
    public static final class C3237d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14315Z;

        public C3237d(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14315Z = r1
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
                io.tacocrypto.app.ui.secret.SecretFragment r0 = r1.f14315Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$e */
    public static final class C3238e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14316Z;

        public C3238e(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14316Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.Boolean r4) {
                r3 = this;
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                io.tacocrypto.app.ui.secret.SecretFragment r0 = r3.f14316Z
                java.lang.String r1 = "childFragmentManager"
                java.lang.String r2 = "fragmentManager"
                androidx.fragment.app.d0 r0 = de.C1433c.m3972a(r0, r1, r2)
                r1 = 0
                if (r4 == 0) goto L1f
                p214m2.C4339q.m9706k(r0, r2)
                gf.d r4 = new gf.d
                r4.<init>()
                r4.mo1229K0(r0, r1)
                goto L2a
            L1f:
                p214m2.C4339q.m9706k(r0, r2)
                hf.c r4 = new hf.c
                r4.<init>()
                r4.mo1229K0(r0, r1)
            L2a:
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$f */
    public static final class C3239f extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<io.tacocrypto.app.p156ui.secret.EnumC3251c, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14317Z;

        public C3239f(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14317Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(io.tacocrypto.app.p156ui.secret.EnumC3251c r5) {
                r4 = this;
                io.tacocrypto.app.ui.secret.c r5 = (io.tacocrypto.app.p156ui.secret.EnumC3251c) r5
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r5, r0)
                int r5 = r5.ordinal()
                java.lang.String r0 = "fragmentManager"
                java.lang.String r1 = "childFragmentManager"
                r2 = 0
                switch(r5) {
                    case 0: goto L185;
                    case 1: goto L176;
                    case 2: goto L165;
                    case 3: goto L156;
                    case 4: goto L147;
                    case 5: goto L137;
                    case 6: goto L127;
                    case 7: goto L117;
                    case 8: goto L107;
                    case 9: goto L13;
                    case 10: goto Lf7;
                    case 11: goto Le7;
                    case 12: goto Ld7;
                    case 13: goto Lc7;
                    case 14: goto Lb7;
                    case 15: goto La7;
                    case 16: goto L97;
                    case 17: goto L87;
                    case 18: goto L77;
                    case 19: goto L67;
                    case 20: goto L57;
                    case 21: goto L47;
                    case 22: goto L37;
                    case 23: goto L27;
                    case 24: goto L17;
                    default: goto L13;
                }
            L13:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                goto L1bf
            L17:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                pg.b r0 = new pg.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L27:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                bf.b r0 = new bf.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L37:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                ye.b r0 = new ye.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L47:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                dg.b r0 = new dg.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L57:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                qf.b r0 = new qf.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L67:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                eg.b r0 = new eg.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L77:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                cg.h r0 = new cg.h
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L87:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                ff.b r0 = new ff.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L97:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                og.b r0 = new og.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            La7:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                rf.c r0 = new rf.c
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            Lb7:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                bg.b r0 = new bg.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            Lc7:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                ag.b r0 = new ag.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            Ld7:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                le.c r0 = new le.c
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            Le7:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                af.b r0 = new af.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            Lf7:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                re.b r0 = new re.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L107:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                ef.b r0 = new ef.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L117:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                df.c r0 = new df.c
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L127:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                pe.b r0 = new pe.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L137:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                gg.e r0 = new gg.e
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L147:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                ue.b r0 = new ue.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L156:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                jf.b r0 = new jf.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L165:
                ig.c$b r5 = p152ig.C3146c.f12587q1
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                ig.c r0 = new ig.c
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L176:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                androidx.fragment.app.d0 r5 = de.C1433c.m3972a(r5, r1, r0)
                lg.b r0 = new lg.b
                r0.<init>()
                r0.mo1229K0(r5, r2)
                goto L1c4
            L185:
                io.tacocrypto.app.ui.secret.SecretFragment r5 = r4.f14317Z
                android.content.Context r0 = r5.m1334s0()
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                android.content.Intent r1 = new android.content.Intent
                java.lang.Class<io.tacocrypto.app.ui.tools.nftwallet.NFTWalletActivity> r3 = io.tacocrypto.app.p156ui.tools.nftwallet.NFTWalletActivity.class
                r1.<init>(r0, r3)
                androidx.fragment.app.a0<?> r0 = r5.f2295q0
                if (r0 == 0) goto L1a3
                android.content.Context r5 = r0.f2034Z
                java.lang.Object r0 = p046d0.C1259a.f6733a
                p046d0.C1259a.a.m3708b(r5, r1, r2)
                goto L1c4
            L1a3:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Fragment "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = " not attached to Activity"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            L1bf:
                java.lang.String r0 = "Update the app to use this tool"
                p458zg.C7331c.m14403b(r5, r0, r2)
            L1c4:
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$g */
    public static final class C3240g extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<de.C1444n, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14318Z;

        public C3240g(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14318Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(de.C1444n r12) {
                r11 = this;
                de.n r12 = (de.C1444n) r12
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r12, r0)
                io.tacocrypto.app.ui.secret.SecretFragment r0 = r11.f14318Z
                androidx.fragment.app.s r0 = r0.m1330q0()
                io.tacocrypto.app.ui.secret.SecretFragment r1 = r11.f14318Z
                android.view.LayoutInflater r2 = r1.f2266I0
                r3 = 0
                if (r2 != 0) goto L18
                android.view.LayoutInflater r2 = r1.m1325m0(r3)
            L18:
                java.lang.String r1 = "layoutInflater"
                p214m2.C4339q.m9705j(r2, r1)
                io.tacocrypto.app.ui.secret.c r4 = r12.f7163a
                java.lang.String r4 = r4.m7732g()
                md.t0 r12 = r12.f7165c
                if (r12 == 0) goto L2d
                java.lang.String r12 = r12.getImage()
                if (r12 != 0) goto L2f
            L2d:
                java.lang.String r12 = ""
            L2f:
                io.tacocrypto.app.ui.secret.a r5 = new io.tacocrypto.app.ui.secret.a
                io.tacocrypto.app.ui.secret.SecretFragment r6 = r11.f14318Z
                r5.<init>(r6)
                java.lang.String r6 = "activity"
                p214m2.C4339q.m9706k(r0, r6)
                p214m2.C4339q.m9706k(r2, r1)
                java.lang.String r1 = "name"
                p214m2.C4339q.m9706k(r4, r1)
                java.lang.String r1 = "image"
                p214m2.C4339q.m9706k(r12, r1)
                java.lang.String r1 = "callback"
                p214m2.C4339q.m9706k(r5, r1)
                r1 = 2131558465(0x7f0d0041, float:1.8742247E38)
                r6 = 0
                android.view.View r1 = r2.inflate(r1, r3, r6)
                r2 = 2131361949(0x7f0a009d, float:1.8343665E38)
                android.view.View r3 = p064e.C1494h.m4055f(r1, r2)
                com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
                if (r3 == 0) goto Lcf
                r2 = 2131362262(0x7f0a01d6, float:1.83443E38)
                android.view.View r7 = p064e.C1494h.m4055f(r1, r2)
                androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
                if (r7 == 0) goto Lcf
                r2 = 2131362687(0x7f0a037f, float:1.8345162E38)
                android.view.View r8 = p064e.C1494h.m4055f(r1, r2)
                androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
                if (r8 == 0) goto Lcf
                r2 = 2131362711(0x7f0a0397, float:1.834521E38)
                android.view.View r9 = p064e.C1494h.m4055f(r1, r2)
                androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
                if (r9 == 0) goto Lcf
                androidx.appcompat.widget.LinearLayoutCompat r1 = (androidx.appcompat.widget.LinearLayoutCompat) r1
                h8.b r2 = new h8.b
                r10 = 2132017461(0x7f140135, float:1.9673201E38)
                r2.<init>(r0, r10)
                r2.m7363a(r1)
                androidx.appcompat.app.AlertController$b r1 = r2.f715a
                r1.f704j = r6
                androidx.appcompat.app.b r1 = r2.create()
                java.lang.String r2 = "binding.imageView"
                p214m2.C4339q.m9705j(r7, r2)
                vg.C6672m.m13521h(r7, r12)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                java.lang.String r2 = " Tool obtained"
                r12.append(r2)
                java.lang.String r12 = r12.toString()
                r9.setText(r12)
                r12 = 2131951941(0x7f130145, float:1.954031E38)
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r6] = r4
                java.lang.String r12 = r0.getString(r12, r2)
                r8.setText(r12)
                vd.b r12 = new vd.b
                r12.<init>(r1, r5)
                r3.setOnClickListener(r12)
                r1.show()
                ch.l r12 = ch.C0985l.f5061a
                return r12
            Lcf:
                android.content.res.Resources r12 = r1.getResources()
                java.lang.String r12 = r12.getResourceName(r2)
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "Missing required view with ID: "
                java.lang.String r12 = r1.concat(r12)
                r0.<init>(r12)
                throw r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$h */
    public static final class C3241h extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<de.C1444n, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14319Z;

        public C3241h(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14319Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(de.C1444n r9) {
                r8 = this;
                de.n r9 = (de.C1444n) r9
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r9, r0)
                io.tacocrypto.app.ui.secret.SecretFragment r0 = r8.f14319Z
                androidx.fragment.app.s r0 = r0.m1330q0()
                io.tacocrypto.app.ui.secret.SecretFragment r1 = r8.f14319Z
                android.view.LayoutInflater r2 = r1.f2266I0
                r3 = 0
                if (r2 != 0) goto L18
                android.view.LayoutInflater r2 = r1.m1325m0(r3)
            L18:
                java.lang.String r1 = "layoutInflater"
                p214m2.C4339q.m9705j(r2, r1)
                java.lang.String r4 = "activity"
                p214m2.C4339q.m9706k(r0, r4)
                p214m2.C4339q.m9706k(r2, r1)
                java.lang.String r1 = "toolUi"
                p214m2.C4339q.m9706k(r9, r1)
                r1 = 2131558464(0x7f0d0040, float:1.8742245E38)
                r4 = 0
                android.view.View r1 = r2.inflate(r1, r3, r4)
                r2 = 2131361949(0x7f0a009d, float:1.8343665E38)
                android.view.View r3 = p064e.C1494h.m4055f(r1, r2)
                com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
                if (r3 == 0) goto La7
                r2 = 2131362262(0x7f0a01d6, float:1.83443E38)
                android.view.View r5 = p064e.C1494h.m4055f(r1, r2)
                androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
                if (r5 == 0) goto La7
                r2 = 2131362687(0x7f0a037f, float:1.8345162E38)
                android.view.View r5 = p064e.C1494h.m4055f(r1, r2)
                androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
                if (r5 == 0) goto La7
                r2 = 2131362711(0x7f0a0397, float:1.834521E38)
                android.view.View r6 = p064e.C1494h.m4055f(r1, r2)
                androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
                if (r6 == 0) goto La7
                androidx.appcompat.widget.LinearLayoutCompat r1 = (androidx.appcompat.widget.LinearLayoutCompat) r1
                h8.b r2 = new h8.b
                r7 = 2132017461(0x7f140135, float:1.9673201E38)
                r2.<init>(r0, r7)
                r2.m7363a(r1)
                androidx.appcompat.app.AlertController$b r0 = r2.f715a
                r0.f704j = r4
                androidx.appcompat.app.b r0 = r2.create()
                java.lang.String r1 = "Info "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                io.tacocrypto.app.ui.secret.c r2 = r9.f7163a
                java.lang.String r2 = r2.m7732g()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r6.setText(r1)
                md.t0 r9 = r9.f7165c
                if (r9 == 0) goto L94
                java.lang.String r9 = r9.getInfo()
                if (r9 == 0) goto L94
                goto L96
            L94:
                java.lang.String r9 = ""
            L96:
                r5.setText(r9)
                ud.a r9 = new ud.a
                r9.<init>(r0)
                r3.setOnClickListener(r9)
                r0.show()
                ch.l r9 = ch.C0985l.f5061a
                return r9
            La7:
                android.content.res.Resources r9 = r1.getResources()
                java.lang.String r9 = r9.getResourceName(r2)
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "Missing required view with ID: "
                java.lang.String r9 = r1.concat(r9)
                r0.<init>(r9)
                throw r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$i */
    public static final class C3242i extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14320Z;

        public C3242i(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14320Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r3) {
                r2 = this;
                android.view.View r3 = (android.view.View) r3
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r3, r0)
                io.tacocrypto.app.ui.secret.SecretFragment r3 = r2.f14320Z
                java.lang.String r0 = "childFragmentManager"
                java.lang.String r1 = "fragmentManager"
                androidx.fragment.app.d0 r3 = de.C1433c.m3972a(r3, r0, r1)
                ee.f r0 = new ee.f
                r0.<init>()
                r1 = 0
                r0.mo1229K0(r3, r1)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$j */
    public static final class C3243j extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14321Z;

        public C3243j(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14321Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r3) {
                r2 = this;
                android.view.View r3 = (android.view.View) r3
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r3, r0)
                io.tacocrypto.app.ui.secret.SecretFragment r3 = r2.f14321Z
                java.lang.String r0 = "childFragmentManager"
                java.lang.String r1 = "fragmentManager"
                androidx.fragment.app.d0 r3 = de.C1433c.m3972a(r3, r0, r1)
                ee.f r0 = new ee.f
                r0.<init>()
                r1 = 0
                r0.mo1229K0(r3, r1)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$k */
    public static final class C3244k implements com.google.android.material.tabs.TabLayout.InterfaceC1200d {

        /* renamed from: a */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14322a;

        public C3244k(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14322a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1199c
        /* renamed from: a */
        public void mo3516a(com.google.android.material.tabs.TabLayout.C1202f r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1199c
        /* renamed from: b */
        public void mo3517b(com.google.android.material.tabs.TabLayout.C1202f r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC1199c
        /* renamed from: c */
        public void mo3518c(com.google.android.material.tabs.TabLayout.C1202f r4) {
                r3 = this;
                if (r4 == 0) goto L2a
                int r4 = r4.f6320d
                io.tacocrypto.app.ui.secret.SecretFragment r0 = r3.f14322a
                int r1 = io.tacocrypto.app.p156ui.secret.SecretFragment.f14309X0
                de.l r0 = r0.m7730H0()
                androidx.lifecycle.d0<java.lang.Integer> r1 = r0.f7152u
                java.lang.Object r1 = r1.m1411d()
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 != 0) goto L17
                goto L1e
            L17:
                int r1 = r1.intValue()
                if (r1 != r4) goto L1e
                goto L2a
            L1e:
                androidx.lifecycle.d0<java.lang.Integer> r1 = r0.f7152u
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                r1.mo7l(r2)
                r0.m3973d(r4)
            L2a:
                return
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$l */
    public static final class C3245l extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f14323Z;

        public C3245l(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f14323Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f14323Z
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$m */
    public static final class C3246m extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f14324Z;

        public C3246m(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f14324Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f14324Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$n */
    public /* synthetic */ class C3247n extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3549q> {

        /* renamed from: g0 */
        public static final io.tacocrypto.app.p156ui.secret.SecretFragment.C3247n f14325g0 = null;

        static {
                io.tacocrypto.app.ui.secret.SecretFragment$n r0 = new io.tacocrypto.app.ui.secret.SecretFragment$n
                r0.<init>()
                io.tacocrypto.app.p156ui.secret.SecretFragment.C3247n.f14325g0 = r0
                return
        }

        public C3247n() {
                r6 = this;
                java.lang.Class<jd.q> r2 = p171jd.C3549q.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/FragmentSecretBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3549q mo115i(android.view.LayoutInflater r19, android.view.ViewGroup r20, java.lang.Boolean r21) {
                r18 = this;
                r0 = r19
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                r1 = r20
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = r21
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                java.lang.String r3 = "p0"
                p214m2.C4339q.m9706k(r0, r3)
                r3 = 2131558483(0x7f0d0053, float:1.8742283E38)
                r4 = 0
                android.view.View r0 = r0.inflate(r3, r1, r4)
                if (r2 == 0) goto L22
                r1.addView(r0)
            L22:
                r1 = 2131361845(0x7f0a0035, float:1.8343454E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r5 = r2
                androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
                if (r5 == 0) goto Lc4
                r1 = 2131361952(0x7f0a00a0, float:1.834367E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r6 = r2
                com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
                if (r6 == 0) goto Lc4
                r1 = 2131362058(0x7f0a010a, float:1.8343886E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r7 = r2
                androidx.appcompat.widget.LinearLayoutCompat r7 = (androidx.appcompat.widget.LinearLayoutCompat) r7
                if (r7 == 0) goto Lc4
                r1 = 2131362127(0x7f0a014f, float:1.8344026E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r8 = r2
                androidx.appcompat.widget.LinearLayoutCompat r8 = (androidx.appcompat.widget.LinearLayoutCompat) r8
                if (r8 == 0) goto Lc4
                r1 = 2131362196(0x7f0a0194, float:1.8344166E38)
                android.view.View r9 = p064e.C1494h.m4055f(r0, r1)
                if (r9 == 0) goto Lc4
                r1 = 2131362242(0x7f0a01c2, float:1.834426E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r10 = r2
                androidx.appcompat.widget.AppCompatImageView r10 = (androidx.appcompat.widget.AppCompatImageView) r10
                if (r10 == 0) goto Lc4
                r1 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r11 = r2
                androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
                if (r11 == 0) goto Lc4
                r1 = 2131362568(0x7f0a0308, float:1.834492E38)
                android.view.View r12 = p064e.C1494h.m4055f(r0, r1)
                if (r12 == 0) goto Lc4
                r1 = 2131362604(0x7f0a032c, float:1.8344993E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r13 = r2
                com.google.android.material.button.MaterialButton r13 = (com.google.android.material.button.MaterialButton) r13
                if (r13 == 0) goto Lc4
                r1 = 2131362605(0x7f0a032d, float:1.8344995E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r14 = r2
                android.widget.Space r14 = (android.widget.Space) r14
                if (r14 == 0) goto Lc4
                r1 = 2131362646(0x7f0a0356, float:1.8345078E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r15 = r2
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r15 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r15
                if (r15 == 0) goto Lc4
                r1 = 2131362648(0x7f0a0358, float:1.8345083E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r16 = r2
                com.google.android.material.tabs.TabLayout r16 = (com.google.android.material.tabs.TabLayout) r16
                if (r16 == 0) goto Lc4
                r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r17 = r2
                androidx.appcompat.widget.AppCompatTextView r17 = (androidx.appcompat.widget.AppCompatTextView) r17
                if (r17 == 0) goto Lc4
                jd.q r1 = new jd.q
                r4 = r0
                androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return r1
            Lc4:
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r0 = r0.getResourceName(r1)
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "Missing required view with ID: "
                java.lang.String r0 = r2.concat(r0)
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: io.tacocrypto.app.ui.secret.SecretFragment$o */
    public static final class C3248o extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f14326Z;

        public C3248o(io.tacocrypto.app.p156ui.secret.SecretFragment r1) {
                r0 = this;
                r0.f14326Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                io.tacocrypto.app.ui.secret.SecretFragment r0 = r1.f14326Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public SecretFragment() {
            r4 = this;
            r4.<init>()
            io.tacocrypto.app.ui.secret.SecretFragment$o r0 = new io.tacocrypto.app.ui.secret.SecretFragment$o
            r0.<init>(r4)
            io.tacocrypto.app.ui.secret.SecretFragment$l r1 = new io.tacocrypto.app.ui.secret.SecretFragment$l
            r1.<init>(r4)
            java.lang.Class<de.l> r2 = de.C1442l.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            io.tacocrypto.app.ui.secret.SecretFragment$m r3 = new io.tacocrypto.app.ui.secret.SecretFragment$m
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f14310V0 = r0
            de.a r0 = new de.a
            io.tacocrypto.app.ui.secret.SecretFragment$a r1 = new io.tacocrypto.app.ui.secret.SecretFragment$a
            r1.<init>(r4)
            io.tacocrypto.app.ui.secret.SecretFragment$b r2 = new io.tacocrypto.app.ui.secret.SecretFragment$b
            r2.<init>(r4)
            r0.<init>(r1, r2)
            r4.f14311W0 = r0
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: D0 */
    public void mo7720D0() {
            r4 = this;
            de.l r0 = r4.m7730H0()
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r0 = r0.f7137f
            androidx.lifecycle.v r1 = r4.m1311O()
            de.b r2 = new de.b
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            de.l r0 = r4.m7730H0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f7140i
            androidx.lifecycle.v r1 = r4.m1311O()
            de.b r2 = new de.b
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            de.l r0 = r4.m7730H0()
            androidx.lifecycle.d0<java.util.List<de.n>> r0 = r0.f7153v
            androidx.lifecycle.v r1 = r4.m1311O()
            de.b r2 = new de.b
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            de.l r0 = r4.m7730H0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f7154w
            androidx.lifecycle.v r1 = r4.m1311O()
            de.b r2 = new de.b
            r3 = 3
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            de.l r0 = r4.m7730H0()
            androidx.lifecycle.d0<java.lang.Integer> r0 = r0.f7152u
            androidx.lifecycle.v r1 = r4.m1311O()
            de.b r2 = new de.b
            r3 = 4
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            de.l r0 = r4.m7730H0()
            androidx.lifecycle.d0<vg.b<java.lang.Boolean>> r0 = r0.f7142k
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.secret.SecretFragment$e r3 = new io.tacocrypto.app.ui.secret.SecretFragment$e
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            de.l r0 = r4.m7730H0()
            androidx.lifecycle.d0<vg.b<io.tacocrypto.app.ui.secret.c>> r0 = r0.f7141j
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.secret.SecretFragment$f r3 = new io.tacocrypto.app.ui.secret.SecretFragment$f
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            de.l r0 = r4.m7730H0()
            androidx.lifecycle.d0<vg.b<de.n>> r0 = r0.f7143l
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.secret.SecretFragment$g r3 = new io.tacocrypto.app.ui.secret.SecretFragment$g
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            de.l r0 = r4.m7730H0()
            androidx.lifecycle.d0<vg.b<de.n>> r0 = r0.f7145n
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.secret.SecretFragment$h r3 = new io.tacocrypto.app.ui.secret.SecretFragment$h
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            de.l r0 = r4.m7730H0()
            androidx.lifecycle.d0<vg.b<de.n>> r0 = r0.f7144m
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.secret.SecretFragment$c r3 = new io.tacocrypto.app.ui.secret.SecretFragment$c
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            de.l r0 = r4.m7730H0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f7138g
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.secret.SecretFragment$d r3 = new io.tacocrypto.app.ui.secret.SecretFragment$d
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: F0 */
    public void mo7721F0() {
            r7 = this;
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.q r0 = (p171jd.C3549q) r0
            androidx.appcompat.widget.LinearLayoutCompat r1 = r0.f15432c
            ud.a r2 = new ud.a
            r2.<init>(r7)
            r1.setOnClickListener(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f15436g
            java.lang.String r2 = "sortView"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.ui.secret.SecretFragment$i r2 = new io.tacocrypto.app.ui.secret.SecretFragment$i
            r2.<init>(r7)
            r3 = 0
            r4 = 1
            vg.C6664e.m13509j(r1, r3, r2, r4)
            com.google.android.material.button.MaterialButton r1 = r0.f15431b
            java.lang.String r2 = "buttonFavorites"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.ui.secret.SecretFragment$j r2 = new io.tacocrypto.app.ui.secret.SecretFragment$j
            r2.<init>(r7)
            vg.C6664e.m13509j(r1, r3, r2, r4)
            T extends w1.a r1 = r7.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.q r1 = (p171jd.C3549q) r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r1.f15437h
            u3.b r2 = new u3.b
            r2.<init>(r7)
            r1.setOnRefreshListener(r2)
            T extends w1.a r1 = r7.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.q r1 = (p171jd.C3549q) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15435f
            vg.t r2 = new vg.t
            android.content.Context r4 = r7.m1334s0()
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "requireContext().applicationContext"
            p214m2.C4339q.m9705j(r4, r5)
            r5 = 2131231395(0x7f0802a3, float:1.807887E38)
            r6 = 4
            r2.<init>(r4, r5, r3, r6)
            r1.m1754g(r2)
            com.google.android.material.tabs.TabLayout r1 = r0.f15438i
            com.google.android.material.tabs.TabLayout$f r2 = r1.m3507h()
            r3 = 2131558638(0x7f0d00ee, float:1.8742597E38)
            r2.m3523a(r3)
            java.lang.String r4 = "FAVORITES"
            r2.m3526d(r4)
            r4 = 2131231261(0x7f08021d, float:1.8078598E38)
            r2.m3524b(r4)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r4 = r1.f6279a0
            boolean r4 = r4.isEmpty()
            r1.m3500a(r2, r4)
            com.google.android.material.tabs.TabLayout r1 = r0.f15438i
            com.google.android.material.tabs.TabLayout$f r2 = r1.m3507h()
            r2.m3523a(r3)
            java.lang.String r4 = "UTILITY"
            r2.m3526d(r4)
            r4 = 2131231263(0x7f08021f, float:1.8078602E38)
            r2.m3524b(r4)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r4 = r1.f6279a0
            boolean r4 = r4.isEmpty()
            r1.m3500a(r2, r4)
            com.google.android.material.tabs.TabLayout r1 = r0.f15438i
            com.google.android.material.tabs.TabLayout$f r2 = r1.m3507h()
            r2.m3523a(r3)
            java.lang.String r3 = "GAMES"
            r2.m3526d(r3)
            r3 = 2131231262(0x7f08021e, float:1.80786E38)
            r2.m3524b(r3)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$f> r3 = r1.f6279a0
            boolean r3 = r3.isEmpty()
            r1.m3500a(r2, r3)
            com.google.android.material.tabs.TabLayout r0 = r0.f15438i
            io.tacocrypto.app.ui.secret.SecretFragment$k r1 = new io.tacocrypto.app.ui.secret.SecretFragment$k
            r1.<init>(r7)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r2 = r0.f6271G0
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto Ld2
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r0 = r0.f6271G0
            r0.add(r1)
        Ld2:
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.q r0 = (p171jd.C3549q) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15435f
            de.a r1 = r7.f14311W0
            r0.setAdapter(r1)
            de.a r0 = r7.f14311W0
            r1 = 2
            r0.f3230c = r1
            androidx.recyclerview.widget.RecyclerView$f r0 = r0.f3228a
            r0.m1818g()
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: G0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3549q> mo7722G0() {
            r2 = this;
            io.tacocrypto.app.ui.secret.SecretFragment$n r0 = io.tacocrypto.app.p156ui.secret.SecretFragment.C3247n.f14325g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    /* renamed from: H0 */
    public final de.C1442l m7730H0() {
            r1 = this;
            ch.d r0 = r1.f14310V0
            java.lang.Object r0 = r0.getValue()
            de.l r0 = (de.C1442l) r0
            return r0
    }

    @Override // ee.InterfaceC1823a
    /* renamed from: a */
    public void mo4588a(java.util.Set<? extends io.tacocrypto.app.p156ui.secret.EnumC3251c> r4, java.util.List<? extends io.tacocrypto.app.p156ui.secret.EnumC3251c> r5) {
            r3 = this;
            java.lang.String r0 = "toolsFavorites"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r1 = "toolsSorted"
            p214m2.C4339q.m9706k(r5, r1)
            de.l r2 = r3.m7730H0()
            java.util.Objects.requireNonNull(r2)
            p214m2.C4339q.m9706k(r4, r0)
            p214m2.C4339q.m9706k(r5, r1)
            r2.f7147p = r4
            r2.f7148q = r5
            r2.m3974e()
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: e0 */
    public void mo1322e0() {
            r3 = this;
            r0 = 1
            r3.f2258A0 = r0
            de.l r1 = r3.m7730H0()
            nd.j1 r2 = r1.f7135d
            java.util.Set r2 = r2.m10824e()
            r1.f7147p = r2
            nd.j1 r2 = r1.f7135d
            java.util.List r2 = r2.m10825f()
            r1.f7148q = r2
            androidx.lifecycle.d0<java.util.List<de.n>> r2 = r1.f7153v
            java.lang.Object r2 = r2.m1411d()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L29
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L28
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L2e
            r1.m3974e()
        L2e:
            return
    }
}
