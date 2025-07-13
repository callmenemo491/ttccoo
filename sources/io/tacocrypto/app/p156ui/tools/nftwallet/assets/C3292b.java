package io.tacocrypto.app.p156ui.tools.nftwallet.assets;

/* renamed from: io.tacocrypto.app.ui.tools.nftwallet.assets.b */
/* loaded from: classes.dex */
public final class C3292b extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<io.tacocrypto.app.p156ui.tools.nftwallet.assets.NFTAssetsFragment.C3283a, java.lang.Integer, ch.C0978e<? extends p417xf.C7050d, ? extends p417xf.C7062p>, ch.C0985l> {

    /* renamed from: Z */
    public static final io.tacocrypto.app.p156ui.tools.nftwallet.assets.C3292b f14412Z = null;

    static {
            io.tacocrypto.app.ui.tools.nftwallet.assets.b r0 = new io.tacocrypto.app.ui.tools.nftwallet.assets.b
            r0.<init>()
            io.tacocrypto.app.p156ui.tools.nftwallet.assets.C3292b.f14412Z = r0
            return
    }

    public C3292b() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(io.tacocrypto.app.p156ui.tools.nftwallet.assets.NFTAssetsFragment.C3283a r7, java.lang.Integer r8, ch.C0978e<? extends p417xf.C7050d, ? extends p417xf.C7062p> r9) {
            r6 = this;
            io.tacocrypto.app.ui.tools.nftwallet.assets.NFTAssetsFragment$a r7 = (io.tacocrypto.app.p156ui.tools.nftwallet.assets.NFTAssetsFragment.C3283a) r7
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            ch.e r9 = (ch.C0978e) r9
            java.lang.String r8 = "$this$onBind"
            p214m2.C4339q.m9706k(r7, r8)
            java.lang.String r8 = "item"
            p214m2.C4339q.m9706k(r9, r8)
            p214m2.C4339q.m9706k(r9, r8)
            android.view.View r7 = r7.f3208a
            jd.l r7 = p171jd.C3531l.m8000d(r7)
            java.lang.Object r8 = r7.f15304e
            r0 = r8
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            java.lang.String r8 = "imageView"
            p214m2.C4339q.m9705j(r0, r8)
            B r8 = r9.f5051Z
            xf.p r8 = (p417xf.C7062p) r8
            r1 = 0
            if (r8 == 0) goto L32
            java.lang.String r8 = r8.getImageURL()
            goto L33
        L32:
            r8 = r1
        L33:
            B r2 = r9.f5051Z
            xf.p r2 = (p417xf.C7062p) r2
            if (r2 == 0) goto L3d
            java.lang.String r1 = r2.getVideoURL()
        L3d:
            r2 = r1
            r1 = 48
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r5 = 8
            r1 = r8
            vg.C6672m.m13523j(r0, r1, r2, r3, r4, r5)
            java.lang.Object r8 = r7.f15305f
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            B r0 = r9.f5051Z
            xf.p r0 = (p417xf.C7062p) r0
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L5c
            goto L5e
        L5c:
            java.lang.String r0 = "--"
        L5e:
            r8.setText(r0)
            java.lang.Object r8 = r7.f15302c
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            A r1 = r9.f5050Y
            xf.d r1 = (p417xf.C7050d) r1
            int r1 = r1.getAssets()
            r0.append(r1)
            java.lang.String r1 = " assets"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.setText(r0)
            java.lang.Object r8 = r7.f15303d
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            A r0 = r9.f5050Y
            xf.d r0 = (p417xf.C7050d) r0
            java.lang.String r0 = r0.getValueDollarString()
            r8.setText(r0)
            java.lang.Object r7 = r7.f15306g
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            A r8 = r9.f5050Y
            xf.d r8 = (p417xf.C7050d) r8
            double r8 = r8.getPriceWax()
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r9 = 0
            r0 = 2
            java.lang.String r8 = vg.C6672m.m13537x(r8, r0, r9, r0)
            r7.setText(r8)
            ch.l r7 = ch.C0985l.f5061a
            return r7
    }
}
