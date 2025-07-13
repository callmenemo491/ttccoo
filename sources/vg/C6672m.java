package vg;

/* renamed from: vg.m */
/* loaded from: classes.dex */
public final class C6672m {

    /* renamed from: a */
    public static long f25944a = -1;

    /* JADX INFO: Add missing generic type declarations: [IT] */
    /* renamed from: vg.m$a */
    public static final class a<IT> extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<p086f2.InterfaceC1987b<? extends IT>, java.lang.Integer, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4624p<p086f2.InterfaceC1987b<? extends IT>, java.lang.Integer, ch.C0985l> f25945Z;

        public a(mh.InterfaceC4624p<? super p086f2.InterfaceC1987b<? extends IT>, ? super java.lang.Integer, ch.C0985l> r1) {
                r0 = this;
                r0.f25945Z = r1
                r1 = 2
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public ch.C0985l mo122l(java.lang.Object r6, java.lang.Integer r7) {
                r5 = this;
                f2.b r6 = (p086f2.InterfaceC1987b) r6
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                java.lang.String r0 = "$this$onClick"
                p214m2.C4339q.m9706k(r6, r0)
                long r0 = vg.C6672m.f25944a
                r2 = 500(0x1f4, float:7.0E-43)
                long r2 = (long) r2
                long r0 = r0 + r2
                long r2 = java.lang.System.currentTimeMillis()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L2d
                long r0 = java.lang.System.currentTimeMillis()
                vg.C6672m.f25944a = r0
                r0 = -1
                if (r7 == r0) goto L2d
                mh.p<f2.b<? extends IT>, java.lang.Integer, ch.l> r0 = r5.f25945Z
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r0.mo122l(r6, r7)
            L2d:
                ch.l r6 = ch.C0985l.f5061a
                return r6
        }
    }

    /* renamed from: a */
    public static final java.lang.String m13514a(java.lang.Throwable r2) {
            boolean r0 = r2 instanceof p105g2.C2226t
            if (r0 == 0) goto L38
            boolean r0 = r2 instanceof p105g2.C2224r
            g2.t r2 = (p105g2.C2226t) r2
            if (r0 == 0) goto L33
            g2.l r0 = r2.f10175Y
            byte[] r0 = r0.f10136b
            java.lang.String r1 = "this.networkResponse.data"
            p214m2.C4339q.m9705j(r0, r1)
            java.lang.String r0 = p362uh.C6463i.m13051H(r0)
            int r1 = r0.length()
            if (r1 != 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L3c
            java.lang.String r0 = "Server error ("
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            g2.l r2 = r2.f10175Y
            int r2 = r2.f10135a
            r1 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r2, r1)
            goto L3c
        L33:
            java.lang.String r0 = p185k7.C3828h5.m8597l(r2)
            goto L3c
        L38:
            java.lang.String r0 = r2.getMessage()
        L3c:
            return r0
    }

    /* renamed from: b */
    public static final java.lang.String m13515b(int r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = "---"
            goto L9
        L5:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L9:
            return r0
    }

    /* renamed from: c */
    public static final p255od.C5238z m13516c(p255od.C5194b0 r5, java.util.List<p255od.C5238z> r6) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "listMarket"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = r5.getCurrency()
            java.lang.String r1 = "WAX"
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            r1 = 0
            if (r0 == 0) goto L18
            return r1
        L18:
            java.util.Iterator r6 = r6.iterator()
        L1c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r6.next()
            r2 = r0
            od.z r2 = (p255od.C5238z) r2
            od.s r3 = r2.getQuote_token()
            od.o0 r3 = r3.getSymbol()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = r5.getCurrency()
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 == 0) goto L5d
            od.s r3 = r2.getQuote_token()
            java.lang.String r3 = r3.getContract()
            java.lang.String r4 = r5.getContract()
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 == 0) goto L5d
            od.s r2 = r2.getBase_token()
            boolean r2 = r2.isWax()
            if (r2 == 0) goto L5d
            r2 = 1
            goto L5e
        L5d:
            r2 = 0
        L5e:
            if (r2 == 0) goto L1c
            r1 = r0
        L61:
            od.z r1 = (p255od.C5238z) r1
            return r1
    }

    /* renamed from: d */
    public static final double m13517d(int r4) {
            double r0 = (double) r4
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.pow(r2, r0)
            return r0
    }

    /* renamed from: e */
    public static final java.util.List<p255od.C5238z> m13518e(p255od.C5194b0 r5, java.util.List<p255od.C5238z> r6) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        Le:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r6.next()
            r2 = r1
            od.z r2 = (p255od.C5238z) r2
            od.s r3 = r2.getQuote_token()
            od.o0 r3 = r3.getSymbol()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = r5.getCurrency()
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 == 0) goto L43
            od.s r3 = r2.getQuote_token()
            java.lang.String r3 = r3.getContract()
            java.lang.String r4 = r5.getContract()
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 != 0) goto L6b
        L43:
            od.s r3 = r2.getBase_token()
            od.o0 r3 = r3.getSymbol()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = r5.getCurrency()
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 == 0) goto L6d
            od.s r2 = r2.getBase_token()
            java.lang.String r2 = r2.getContract()
            java.lang.String r3 = r5.getContract()
            boolean r2 = p214m2.C4339q.m9702c(r2, r3)
            if (r2 == 0) goto L6d
        L6b:
            r2 = 1
            goto L6e
        L6d:
            r2 = 0
        L6e:
            if (r2 == 0) goto Le
            r0.add(r1)
            goto Le
        L74:
            return r0
    }

    /* renamed from: f */
    public static final void m13519f(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r2, r0)
            android.content.Intent r0 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L1c java.lang.Exception -> L23
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)     // Catch: android.content.ActivityNotFoundException -> L1c java.lang.Exception -> L23
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)     // Catch: android.content.ActivityNotFoundException -> L1c java.lang.Exception -> L23
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: android.content.ActivityNotFoundException -> L1c java.lang.Exception -> L23
            r0.setData(r3)     // Catch: android.content.ActivityNotFoundException -> L1c java.lang.Exception -> L23
            r2.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L1c java.lang.Exception -> L23
            goto L23
        L1c:
            r3 = 0
            r0 = 2
            java.lang.String r1 = "Install Anchor Android"
            vg.C6664e.m13511l(r2, r1, r3, r0)
        L23:
            return
    }

    /* renamed from: g */
    public static final void m13520g(android.content.Context r8, java.lang.String r9) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            r2 = 2131099741(0x7f06005d, float:1.7811844E38)
            int r2 = p046d0.C1259a.m3706b(r8, r2)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 | r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            if (r2 == 0) goto L25
            int r2 = r2.intValue()
            java.lang.String r4 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            r3.putInt(r4, r2)
        L25:
            r2 = 1
            java.lang.String r4 = "android.support.customtabs.extra.TITLE_VISIBILITY"
            r0.putExtra(r4, r2)
            r4 = 0
            java.lang.String r5 = "android.support.customtabs.extra.SESSION"
            boolean r6 = r0.hasExtra(r5)     // Catch: java.lang.Throwable -> L64
            r7 = 0
            if (r6 != 0) goto L40
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Throwable -> L64
            r6.<init>()     // Catch: java.lang.Throwable -> L64
            r6.putBinder(r5, r7)     // Catch: java.lang.Throwable -> L64
            r0.putExtras(r6)     // Catch: java.lang.Throwable -> L64
        L40:
            java.lang.String r5 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"
            r0.putExtra(r5, r2)     // Catch: java.lang.Throwable -> L64
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L64
            r0.putExtras(r2)     // Catch: java.lang.Throwable -> L64
            r0.putExtras(r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = "androidx.browser.customtabs.extra.SHARE_STATE"
            r0.putExtra(r2, r4)     // Catch: java.lang.Throwable -> L64
            android.net.Uri r2 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L64
            r0.setData(r2)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r2 = p046d0.C1259a.f6733a     // Catch: java.lang.Throwable -> L64
            p046d0.C1259a.a.m3708b(r8, r0, r7)     // Catch: java.lang.Throwable -> L64
            ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L64
            goto L69
        L64:
            r0 = move-exception
            java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
        L69:
            java.lang.Throwable r0 = ch.C0979f.m2690b(r0)
            if (r0 == 0) goto L8f
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L7e
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L7e
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> L7e
            r8.startActivity(r0)     // Catch: java.lang.Throwable -> L7e
            ch.l r9 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L7e
            goto L83
        L7e:
            r9 = move-exception
            java.lang.Object r9 = p074e9.C1805a.m4520e(r9)
        L83:
            java.lang.Throwable r9 = ch.C0979f.m2690b(r9)
            if (r9 == 0) goto L8f
            r9 = 2
            java.lang.String r0 = "Error open web url"
            vg.C6664e.m13511l(r8, r0, r4, r9)
        L8f:
            return
    }

    /* renamed from: h */
    public static final void m13521h(android.widget.ImageView r1, java.lang.String r2) {
            if (r2 == 0) goto Lb
            boolean r0 = p362uh.C6463i.m13054K(r2)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            if (r0 != 0) goto L1a
            com.bumptech.glide.j r0 = com.bumptech.glide.ComponentCallbacks2C0999c.m2737f(r1)
            com.bumptech.glide.i r2 = r0.mo2771t(r2)
            r2.m2753O(r1)
            goto L1e
        L1a:
            r2 = 0
            r1.setImageDrawable(r2)
        L1e:
            return
    }

    /* renamed from: i */
    public static final void m13522i(android.widget.ImageView r4, java.lang.String r5, java.lang.String r6, java.lang.Integer r7, mh.InterfaceC4620l<? super p205ld.C4265b<android.graphics.drawable.Drawable>, ? extends p205ld.C4265b<android.graphics.drawable.Drawable>> r8) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r4, r0)
            r1.d r0 = new r1.d
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            r0.m12080d(r1)
            r1.d$a r1 = r0.f22190Y
            r2 = 1098907648(0x41800000, float:16.0)
            r1.f22212q = r2
            r0.invalidateSelf()
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            r3 = -1
            r1[r2] = r3
            r0.m12078b(r1)
            r0.start()
            if (r7 == 0) goto L38
            int r7 = r7.intValue()
            int r7 = vg.C6664e.m13501b(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L39
        L38:
            r7 = 0
        L39:
            com.bumptech.glide.j r1 = com.bumptech.glide.ComponentCallbacks2C0999c.m2737f(r4)
            ld.c r1 = (p205ld.C4266c) r1
            java.lang.String r2 = ""
            if (r5 == 0) goto L50
            com.bumptech.glide.i r6 = r1.mo2766o()
            ld.b r6 = (p205ld.C4265b) r6
            com.bumptech.glide.i r5 = r6.m2759V(r5)
        L4d:
            ld.b r5 = (p205ld.C4265b) r5
            goto L6f
        L50:
            if (r6 == 0) goto L64
            ld.f r5 = new ld.f
            r5.<init>(r6)
            com.bumptech.glide.i r6 = r1.mo2766o()
            ld.b r6 = (p205ld.C4265b) r6
            com.bumptech.glide.i r5 = r6.m2759V(r5)
            ld.b r5 = (p205ld.C4265b) r5
            goto L6f
        L64:
            com.bumptech.glide.i r5 = r1.mo2766o()
            ld.b r5 = (p205ld.C4265b) r5
            com.bumptech.glide.i r5 = r5.m2759V(r2)
            goto L4d
        L6f:
            ld.b r5 = r5.m9575c0()
            r6 = 20000(0x4e20, float:2.8026E-41)
            ld.b r5 = r5.m9581i0(r6)
            if (r7 == 0) goto L87
            int r6 = r7.intValue()
            ld.b r6 = r5.m9578f0(r6, r6)
            if (r6 != 0) goto L86
            goto L87
        L86:
            r5 = r6
        L87:
            ld.b r5 = r5.m9579g0(r0)
            r6 = 17170445(0x106000d, float:2.461195E-38)
            ld.b r5 = r5.m9574b0(r6)
            if (r8 == 0) goto La2
            p214m2.C4339q.m9705j(r5, r2)
            java.lang.Object r6 = r8.mo107b(r5)
            ld.b r6 = (p205ld.C4265b) r6
            if (r6 != 0) goto La0
            goto La2
        La0:
            r5 = r6
            goto La7
        La2:
            java.lang.String r6 = "this"
            p214m2.C4339q.m9705j(r5, r6)
        La7:
            r5.m2753O(r4)
            return
    }

    /* renamed from: j */
    public static /* synthetic */ void m13523j(android.widget.ImageView r0, java.lang.String r1, java.lang.String r2, java.lang.Integer r3, mh.InterfaceC4620l r4, int r5) {
            r4 = r5 & 4
            r5 = 0
            if (r4 == 0) goto L6
            r3 = r5
        L6:
            m13522i(r0, r1, r2, r3, r5)
            return
    }

    /* renamed from: k */
    public static final void m13524k(android.widget.ImageView r1, java.lang.String r2) {
            if (r2 == 0) goto Lb
            boolean r0 = p362uh.C6463i.m13054K(r2)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            if (r0 != 0) goto L38
            com.bumptech.glide.j r0 = com.bumptech.glide.ComponentCallbacks2C0999c.m2737f(r1)
            ld.c r0 = (p205ld.C4266c) r0
            com.bumptech.glide.i r0 = r0.mo2766o()
            ld.b r0 = (p205ld.C4265b) r0
            com.bumptech.glide.i r2 = r0.m2759V(r2)
            ld.b r2 = (p205ld.C4265b) r2
            ld.b r2 = r2.m9575c0()
            r0 = 20000(0x4e20, float:2.8026E-41)
            ld.b r2 = r2.m9581i0(r0)
            r0 = 44
            ld.b r2 = r2.m9578f0(r0, r0)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            ld.b r2 = r2.m9574b0(r0)
            goto L42
        L38:
            com.bumptech.glide.j r2 = com.bumptech.glide.ComponentCallbacks2C0999c.m2737f(r1)
            java.lang.String r0 = ""
            com.bumptech.glide.i r2 = r2.mo2771t(r0)
        L42:
            r2.m2753O(r1)
            return
    }

    /* renamed from: l */
    public static final p124h7.C2789of m13525l(android.widget.ImageView r1, java.lang.String r2, java.lang.String r3) {
            h7.of r0 = new h7.of
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* renamed from: m */
    public static final <IT, VH extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> p003a2.InterfaceC0004a<java.lang.Object, VH> m13526m(p003a2.InterfaceC0004a<? extends IT, VH> r1, mh.InterfaceC4624p<? super p086f2.InterfaceC1987b<? extends IT>, ? super java.lang.Integer, ch.C0985l> r2) {
            vg.m$a r0 = new vg.m$a
            r0.<init>(r2)
            r1.mo11b(r0)
            return r1
    }

    /* renamed from: n */
    public static final void m13527n(android.app.Activity r6) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r6, r0)
            r0 = 0
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "io.tacocrypto.app"
            java.lang.String r3 = ".test"
            java.lang.String r4 = ""
            r5 = 4
            java.lang.String r2 = p362uh.C6463i.m13057N(r2, r3, r4, r0, r5)     // Catch: java.lang.Exception -> L39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r3.<init>()     // Catch: java.lang.Exception -> L39
            java.lang.String r4 = "https://play.google.com/store/apps/details?id="
            r3.append(r4)     // Catch: java.lang.Exception -> L39
            r3.append(r2)     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L39
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> L39
            r1.setData(r2)     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "com.android.vending"
            r1.setPackage(r2)     // Catch: java.lang.Exception -> L39
            r6.startActivity(r1)     // Catch: java.lang.Exception -> L39
            goto L3f
        L39:
            r1 = 2
            java.lang.String r2 = "Error Play Store"
            vg.C6664e.m13511l(r6, r2, r0, r1)
        L3f:
            return
    }

    /* renamed from: o */
    public static final void m13528o(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "link"
            p214m2.C4339q.m9706k(r3, r0)
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L13
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L13
            r2.startActivity(r0)     // Catch: java.lang.Exception -> L13
        L13:
            return
    }

    /* renamed from: p */
    public static final java.lang.String m13529p(java.lang.String r4) {
            java.lang.String r0 = ""
            r1 = 0
            r2 = 4
            java.lang.String r3 = "https://"
            java.lang.String r4 = p362uh.C6463i.m13057N(r4, r3, r0, r1, r2)
            java.lang.String r3 = "http://"
            java.lang.String r4 = p362uh.C6463i.m13057N(r4, r3, r0, r1, r2)
            return r4
    }

    /* renamed from: q */
    public static final io.tacocrypto.app.TacoApplication m13530q(androidx.fragment.app.ComponentCallbacksC0395n r3) {
            android.content.Context r0 = r3.m1339v()
            r1 = 0
            if (r0 == 0) goto Lc
            android.content.Context r0 = r0.getApplicationContext()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            boolean r2 = r0 instanceof io.tacocrypto.app.TacoApplication
            if (r2 == 0) goto L14
            r1 = r0
            io.tacocrypto.app.TacoApplication r1 = (io.tacocrypto.app.TacoApplication) r1
        L14:
            if (r1 == 0) goto L17
            return r1
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " not attached, tacoApplication is null"
            java.lang.String r3 = androidx.fragment.app.C0393m.m1291a(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: r */
    public static final java.lang.String m13531r(long r10, java.lang.String r12) {
            java.lang.String r0 = "string"
            p214m2.C4339q.m9706k(r12, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L81
            r12 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r12
            long r10 = r10 / r0
            r12 = 3600(0xe10, float:5.045E-42)
            long r0 = (long) r12
            long r2 = r10 / r0
            long r0 = r0 * r2
            long r10 = r10 - r0
            r12 = 60
            long r0 = (long) r12
            long r4 = r10 / r0
            long r0 = r0 * r4
            long r10 = r10 - r0
            r12 = 58
            r0 = 10
            java.lang.String r6 = ""
            r7 = 1
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 < 0) goto L43
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L31
            java.lang.String r6 = "0"
        L31:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r2)
            r7.append(r12)
            java.lang.String r6 = r7.toString()
        L43:
            r2 = 48
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 >= 0) goto L58
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r2)
            java.lang.String r6 = r3.toString()
        L58:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r4)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 >= 0) goto L7d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
        L7d:
            java.lang.String r12 = p382w0.C6774a.m13748a(r12, r10)
        L81:
            return r12
    }

    /* renamed from: s */
    public static final void m13532s(android.widget.TextView r1, androidx.fragment.app.AbstractC0375d0 r2, android.view.View r3, android.widget.ImageView r4, ch.C0978e<id.C3131b, java.lang.Boolean> r5) {
            A r0 = r5.f5050Y
            id.b r0 = (id.C3131b) r0
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.f12559a
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            java.lang.String r0 = "all accounts"
        Ld:
            r1.setText(r0)
            B r1 = r5.f5051Z
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1c
            r1 = 0
            goto L1e
        L1c:
            r1 = 8
        L1e:
            r4.setVisibility(r1)
            B r1 = r5.f5051Z
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L31
            vg.l r1 = new vg.l
            r1.<init>(r2)
            goto L32
        L31:
            r1 = 0
        L32:
            r3.setOnLongClickListener(r1)
            return
    }

    /* renamed from: t */
    public static final java.lang.String m13533t(java.lang.String r7) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r7, r0)
            p214m2.C4339q.m9706k(r7, r0)
            p214m2.C4339q.m9706k(r7, r0)
            p214m2.C4339q.m9706k(r7, r0)
            int r1 = r7.length()
            int r2 = r1 / 2
            int r3 = r1 % 2
            r4 = 0
            if (r3 != 0) goto L1b
            r3 = 0
            goto L1c
        L1b:
            r3 = 1
        L1c:
            int r2 = r2 + r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r2 = 0
        L23:
            if (r2 < 0) goto L29
            if (r2 >= r1) goto L29
            r5 = 1
            goto L2a
        L29:
            r5 = 0
        L2a:
            if (r5 == 0) goto L48
            int r5 = r2 + 2
            if (r5 < 0) goto L35
            if (r5 <= r1) goto L33
            goto L35
        L33:
            r6 = r5
            goto L36
        L35:
            r6 = r1
        L36:
            java.lang.CharSequence r2 = r7.subSequence(r2, r6)
            java.lang.String r6 = "it"
            p214m2.C4339q.m9706k(r2, r6)
            java.lang.String r2 = r2.toString()
            r3.add(r2)
            r2 = r5
            goto L23
        L48:
            java.util.ArrayList r7 = new java.util.ArrayList
            r1 = 10
            int r1 = p062dh.C1469e.m3992D(r3, r1)
            r7.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L57:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 16
            gh.C2390b.m6112b(r3)
            int r2 = java.lang.Integer.parseInt(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.add(r2)
            goto L57
        L74:
            p214m2.C4339q.m9706k(r7, r0)
            int r0 = r7.size()
            int[] r0 = new int[r0]
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
        L82:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r7.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto L82
        L98:
            java.lang.String r7 = java.util.Arrays.toString(r0)
            java.lang.String r0 = "toString(this)"
            p214m2.C4339q.m9705j(r7, r0)
            r0 = 4
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r7 = p362uh.C6463i.m13057N(r7, r1, r2, r4, r0)
            return r7
    }

    /* renamed from: u */
    public static final java.lang.String m13534u(double r1, int r3, boolean r4) {
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance(r0)
            r0.setGroupingUsed(r4)
            java.math.RoundingMode r4 = java.math.RoundingMode.FLOOR
            r0.setRoundingMode(r4)
            r0.setMinimumFractionDigits(r3)
            r0.setMaximumFractionDigits(r3)
            java.lang.String r1 = r0.format(r1)
            java.lang.String r2 = "format.format(this)"
            p214m2.C4339q.m9705j(r1, r2)
            return r1
    }

    /* renamed from: v */
    public static /* synthetic */ java.lang.String m13535v(double r0, int r2, boolean r3, int r4) {
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = m13534u(r0, r2, r3)
            return r0
    }

    /* renamed from: w */
    public static final java.lang.String m13536w(java.lang.Double r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = "--- WAX"
            return r4
        L5:
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0.00000000"
            r0.<init>(r1)
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.text.DecimalFormatSymbols r1 = java.text.DecimalFormatSymbols.getInstance(r1)
            r0.setDecimalFormatSymbols(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r2 = r4.doubleValue()
            java.lang.String r4 = r0.format(r2)
            r1.append(r4)
            java.lang.String r4 = " WAX"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    /* renamed from: x */
    public static java.lang.String m13537x(java.lang.Double r2, int r3, boolean r4, int r5) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r4 = 0
        L5:
            if (r2 != 0) goto La
            java.lang.String r2 = "--- WAX"
            goto L37
        La:
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.text.NumberFormat r5 = java.text.NumberFormat.getInstance(r5)
            r5.setGroupingUsed(r4)
            java.math.RoundingMode r4 = java.math.RoundingMode.FLOOR
            r5.setRoundingMode(r4)
            r5.setMinimumFractionDigits(r3)
            r5.setMaximumFractionDigits(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            double r0 = r2.doubleValue()
            java.lang.String r2 = r5.format(r0)
            r3.append(r2)
            java.lang.String r2 = " WAX"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L37:
            return r2
    }

    /* renamed from: y */
    public static final double m13538y(double r4, int r6) {
            double r0 = (double) r6
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = java.lang.Math.pow(r2, r0)
            double r0 = r0 * r4
            return r0
    }
}
