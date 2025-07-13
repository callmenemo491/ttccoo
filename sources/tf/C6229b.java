package tf;

/* renamed from: tf.b */
/* loaded from: classes.dex */
public final class C6229b implements androidx.navigation.InterfaceC0519n {

    /* renamed from: a */
    public final io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi f24177a;

    public C6229b(io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi r1) {
            r0 = this;
            r0.<init>()
            r0.f24177a = r1
            return
    }

    @Override // androidx.navigation.InterfaceC0519n
    /* renamed from: a */
    public android.os.Bundle mo1575a() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.Class<io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi> r2 = io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi.class
            boolean r1 = r1.isAssignableFrom(r2)
            java.lang.String r2 = "collectionDataUi"
            if (r1 == 0) goto L19
            io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi r1 = r4.f24177a
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r0.putParcelable(r2, r1)
            goto L28
        L19:
            java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
            java.lang.Class<io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi> r3 = io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi.class
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L29
            io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi r1 = r4.f24177a
            r0.putSerializable(r2, r1)
        L28:
            return r0
        L29:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi> r2 = io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi.class
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " must implement Parcelable or Serializable or must be an Enum."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.navigation.InterfaceC0519n
    /* renamed from: b */
    public int mo1576b() {
            r1 = this;
            r0 = 2131361848(0x7f0a0038, float:1.834346E38)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof tf.C6229b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            tf.b r4 = (tf.C6229b) r4
            io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi r1 = r3.f24177a
            io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi r4 = r4.f24177a
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public int hashCode() {
            r1 = this;
            io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi r0 = r1.f24177a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ActionNFTCollectionsFragmentToNFTAssetsFragment(collectionDataUi="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi r1 = r2.f24177a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
