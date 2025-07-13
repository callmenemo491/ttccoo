package p361uf;

/* renamed from: uf.k */
/* loaded from: classes.dex */
public final class C6442k implements androidx.navigation.InterfaceC0506e {

    /* renamed from: a */
    public final io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI f24991a;

    public C6442k(io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI r1) {
            r0 = this;
            r0.<init>()
            r0.f24991a = r1
            return
    }

    public static final p361uf.C6442k fromBundle(android.os.Bundle r3) {
            java.lang.String r0 = "bundle"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.Class<uf.k> r0 = p361uf.C6442k.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r3.setClassLoader(r0)
            java.lang.String r0 = "nftAssetUI"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L5e
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.Class<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI> r2 = io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 != 0) goto L48
            java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
            java.lang.Class<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI> r2 = io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L2b
            goto L48
        L2b:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI> r1 = io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " must implement Parcelable or Serializable or must be an Enum."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L48:
            java.lang.Object r3 = r3.get(r0)
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r3 = (io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI) r3
            if (r3 == 0) goto L56
            uf.k r0 = new uf.k
            r0.<init>(r3)
            return r0
        L56:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Argument \"nftAssetUI\" is marked as non-null but was passed a null value."
            r3.<init>(r0)
            throw r3
        L5e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required argument \"nftAssetUI\" is missing and does not have an android:defaultValue"
            r3.<init>(r0)
            throw r3
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p361uf.C6442k
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            uf.k r4 = (p361uf.C6442k) r4
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r1 = r3.f24991a
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r4 = r4.f24991a
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public int hashCode() {
            r1 = this;
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r0 = r1.f24991a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "NFTDetailFragmentArgs(nftAssetUI="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r1 = r2.f24991a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
