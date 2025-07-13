package io.tacocrypto.app.p156ui.tools.nftwallet;

/* loaded from: classes.dex */
public final class NFTWalletActivity extends td.AbstractActivityC6214b<p171jd.C3487a> {

    /* renamed from: m0 */
    public final io.tacocrypto.app.p156ui.tools.nftwallet.NFTWalletActivity.C3282a f14397m0;

    /* renamed from: io.tacocrypto.app.ui.tools.nftwallet.NFTWalletActivity$a */
    public static final class C3282a {

        /* renamed from: a */
        public java.util.List<p417xf.C7050d> f14398a;

        /* renamed from: b */
        public ch.C0978e<p417xf.C7050d, p417xf.C7062p> f14399b;

        public C3282a() {
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                return
        }

        public C3282a(java.util.List r1, ch.C0978e r2, int r3) {
                r0 = this;
                r2 = r3 & 1
                if (r2 == 0) goto L6
                dh.k r1 = p062dh.C1475k.f7237Y
            L6:
                r2 = 0
                java.lang.String r3 = "list"
                p214m2.C4339q.m9706k(r1, r3)
                r0.<init>()
                r0.f14398a = r1
                r0.f14399b = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof io.tacocrypto.app.p156ui.tools.nftwallet.NFTWalletActivity.C3282a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                io.tacocrypto.app.ui.tools.nftwallet.NFTWalletActivity$a r5 = (io.tacocrypto.app.p156ui.tools.nftwallet.NFTWalletActivity.C3282a) r5
                java.util.List<xf.d> r1 = r4.f14398a
                java.util.List<xf.d> r3 = r5.f14398a
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                ch.e<xf.d, xf.p> r1 = r4.f14399b
                ch.e<xf.d, xf.p> r5 = r5.f14399b
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.util.List<xf.d> r0 = r2.f14398a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                ch.e<xf.d, xf.p> r1 = r2.f14399b
                if (r1 != 0) goto Le
                r1 = 0
                goto L12
            Le:
                int r1 = r1.hashCode()
            L12:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "AssetList(list="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.util.List<xf.d> r1 = r2.f14398a
                r0.append(r1)
                java.lang.String r1 = ", asset="
                r0.append(r1)
                ch.e<xf.d, xf.p> r1 = r2.f14399b
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public NFTWalletActivity() {
            r4 = this;
            r4.<init>()
            io.tacocrypto.app.ui.tools.nftwallet.NFTWalletActivity$a r0 = new io.tacocrypto.app.ui.tools.nftwallet.NFTWalletActivity$a
            dh.k r1 = p062dh.C1475k.f7237Y
            r2 = 0
            r3 = 2
            r0.<init>(r1, r2, r3)
            r4.f14397m0 = r0
            return
    }

    /* renamed from: A */
    public final void m7741A(android.content.Intent r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L8
            java.lang.String r1 = r6.getAction()
            goto L9
        L8:
            r1 = r0
        L9:
            if (r6 == 0) goto L10
            android.net.Uri r6 = r6.getData()
            goto L11
        L10:
            r6 = r0
        L11:
            java.lang.String r2 = "android.intent.action.VIEW"
            boolean r1 = p214m2.C4339q.m9702c(r2, r1)
            if (r1 == 0) goto L7b
            if (r6 == 0) goto L7b
            java.lang.String r1 = r6.toString()
            java.lang.String r2 = "appLinkData.toString()"
            p214m2.C4339q.m9705j(r1, r2)
            java.lang.String r2 = "jkhlguyf"
            hk.a$b r2 = hk.C3053a.m7466a(r2)
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r2.mo7467a(r1, r4)
            r2 = 2
            java.lang.String r4 = "taco://transfer"
            boolean r1 = p362uh.C6463i.m13061R(r1, r4, r3, r2)
            if (r1 != 0) goto L3a
            return
        L3a:
            java.lang.String r1 = "tx"
            java.lang.String r1 = r6.getQueryParameter(r1)
            java.lang.String r2 = "bn"
            java.lang.String r6 = r6.getQueryParameter(r2)
            r2 = 1
            if (r1 == 0) goto L52
            boolean r1 = p362uh.C6463i.m13054K(r1)
            if (r1 == 0) goto L50
            goto L52
        L50:
            r1 = 0
            goto L53
        L52:
            r1 = 1
        L53:
            if (r1 != 0) goto L7b
            if (r6 == 0) goto L5d
            boolean r6 = p362uh.C6463i.m13054K(r6)
            if (r6 == 0) goto L5e
        L5d:
            r3 = 1
        L5e:
            if (r3 != 0) goto L7b
            android.app.Application r6 = r5.getApplication()
            boolean r1 = r6 instanceof io.tacocrypto.app.TacoApplication
            if (r1 == 0) goto L6b
            io.tacocrypto.app.TacoApplication r6 = (io.tacocrypto.app.TacoApplication) r6
            goto L6c
        L6b:
            r6 = r0
        L6c:
            if (r6 == 0) goto L7b
            nd.b0 r6 = r6.m7708c()
            mh.p<? super java.lang.Boolean, ? super java.lang.String, ch.l> r6 = r6.f18918n
            if (r6 == 0) goto L7b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.mo122l(r1, r0)
        L7b:
            return
    }

    @Override // td.AbstractActivityC6214b, androidx.fragment.app.ActivityC0405s, androidx.activity.ComponentActivity, p030c0.ActivityC0820g, android.app.Activity
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            android.app.Application r3 = r2.getApplication()
            boolean r0 = r3 instanceof io.tacocrypto.app.TacoApplication
            if (r0 == 0) goto Le
            io.tacocrypto.app.TacoApplication r3 = (io.tacocrypto.app.TacoApplication) r3
            goto Lf
        Le:
            r3 = 0
        Lf:
            r0 = 0
            r1 = 1
            if (r3 == 0) goto L1e
            nd.k1 r3 = r3.m7711f()
            boolean r3 = r3.m10830c()
            if (r3 != 0) goto L1e
            r0 = 1
        L1e:
            if (r0 == 0) goto L24
            r2.finish()
            return
        L24:
            com.bumptech.glide.c r3 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r2)
            r3.m2738c(r1)
            android.content.Intent r3 = r2.getIntent()
            r2.m7741A(r3)
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity
    public void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            r0.m7741A(r1)
            return
    }

    @Override // p083f.ActivityC1921h, androidx.fragment.app.ActivityC0405s, android.app.Activity
    public void onStart() {
            r2 = this;
            super.onStart()
            com.bumptech.glide.c r0 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r2)
            r1 = 1
            r0.m2738c(r1)
            return
    }

    @Override // p083f.ActivityC1921h, androidx.fragment.app.ActivityC0405s, android.app.Activity
    public void onStop() {
            r2 = this;
            super.onStop()
            com.bumptech.glide.c r0 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r2)
            r1 = 2
            r0.m2738c(r1)
            return
    }

    @Override // td.AbstractActivityC6214b
    /* renamed from: z */
    public p383w1.InterfaceC6776a mo7726z() {
            r4 = this;
            android.view.LayoutInflater r0 = r4.getLayoutInflater()
            r1 = 2131558430(0x7f0d001e, float:1.8742176E38)
            r2 = 0
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            java.lang.String r1 = "rootView"
            java.util.Objects.requireNonNull(r0, r1)
            jd.a r1 = new jd.a
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r2 = 1
            r1.<init>(r0, r2)
            return r1
    }
}
