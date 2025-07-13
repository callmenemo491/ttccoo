package p441yj;

/* renamed from: yj.a */
/* loaded from: classes.dex */
public final class C7221a {
    /* renamed from: a */
    public static int m14286a(java.io.InputStream r5, byte[] r6) {
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L12
            int r3 = r1 + r2
            int r4 = r0 - r2
            int r3 = r5.read(r6, r3, r4)
            if (r3 >= 0) goto L10
            goto L12
        L10:
            int r2 = r2 + r3
            goto L3
        L12:
            return r2
    }
}
