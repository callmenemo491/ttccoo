package wf;

/* renamed from: wf.j */
/* loaded from: classes.dex */
public final class C6863j implements androidx.navigation.InterfaceC0519n {

    /* renamed from: a */
    public final io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI f26624a;

    public C6863j(io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI r1) {
            r0 = this;
            r0.<init>()
            r0.f26624a = r1
            return
    }

    @Override // androidx.navigation.InterfaceC0519n
    /* renamed from: a */
    public android.os.Bundle mo1575a() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.Class<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI> r2 = io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI.class
            boolean r1 = r1.isAssignableFrom(r2)
            java.lang.String r2 = "nftAssetUI"
            if (r1 == 0) goto L19
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r1 = r4.f26624a
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r0.putParcelable(r2, r1)
            goto L28
        L19:
            java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
            java.lang.Class<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI> r3 = io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI.class
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L29
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r1 = r4.f26624a
            r0.putSerializable(r2, r1)
        L28:
            return r0
        L29:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI> r2 = io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI.class
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
            r0 = 2131361849(0x7f0a0039, float:1.8343462E38)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof wf.C6863j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wf.j r4 = (wf.C6863j) r4
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r1 = r3.f26624a
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r4 = r4.f26624a
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public int hashCode() {
            r1 = this;
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r0 = r1.f26624a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ActionNFTMainFragmentToNFTDetailFragment(nftAssetUI="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r1 = r2.f26624a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
