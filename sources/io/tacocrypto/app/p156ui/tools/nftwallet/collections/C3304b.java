package io.tacocrypto.app.p156ui.tools.nftwallet.collections;

/* renamed from: io.tacocrypto.app.ui.tools.nftwallet.collections.b */
/* loaded from: classes.dex */
public final class C3304b extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<io.tacocrypto.app.p156ui.tools.nftwallet.collections.NFTCollectionsFragment.C3295a, java.lang.Integer, tf.C6230c.a, ch.C0985l> {

    /* renamed from: Z */
    public static final io.tacocrypto.app.p156ui.tools.nftwallet.collections.C3304b f14426Z = null;

    static {
            io.tacocrypto.app.ui.tools.nftwallet.collections.b r0 = new io.tacocrypto.app.ui.tools.nftwallet.collections.b
            r0.<init>()
            io.tacocrypto.app.p156ui.tools.nftwallet.collections.C3304b.f14426Z = r0
            return
    }

    public C3304b() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(io.tacocrypto.app.p156ui.tools.nftwallet.collections.NFTCollectionsFragment.C3295a r7, java.lang.Integer r8, tf.C6230c.a r9) {
            r6 = this;
            io.tacocrypto.app.ui.tools.nftwallet.collections.NFTCollectionsFragment$a r7 = (io.tacocrypto.app.p156ui.tools.nftwallet.collections.NFTCollectionsFragment.C3295a) r7
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            tf.c$a r9 = (tf.C6230c.a) r9
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
            xf.n r8 = r9.f24194a
            xf.h r8 = r8.getCollection()
            java.lang.String r1 = r8.getImageURL()
            r2 = 0
            r8 = 48
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r4 = 0
            r5 = 8
            vg.C6672m.m13523j(r0, r1, r2, r3, r4, r5)
            java.lang.Object r8 = r7.f15305f
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            xf.n r0 = r9.f24194a
            xf.h r0 = r0.getCollection()
            xf.f r0 = r0.getData()
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L52
            goto L5c
        L52:
            xf.n r0 = r9.f24194a
            xf.h r0 = r0.getCollection()
            java.lang.String r0 = r0.getCollectionName()
        L5c:
            r8.setText(r0)
            java.lang.Object r8 = r7.f15302c
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xf.n r1 = r9.f24194a
            java.lang.String r1 = r1.getAssets()
            r0.append(r1)
            java.lang.String r1 = " assets"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.setText(r0)
            java.lang.Object r8 = r7.f15303d
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            java.lang.String r0 = r9.f24196c
            r8.setText(r0)
            java.lang.Object r7 = r7.f15306g
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            java.lang.Double r8 = r9.f24195b
            r9 = 0
            r0 = 2
            java.lang.String r8 = vg.C6672m.m13537x(r8, r0, r9, r0)
            r7.setText(r8)
            ch.l r7 = ch.C0985l.f5061a
            return r7
    }
}
