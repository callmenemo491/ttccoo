package p072e7;

/* renamed from: e7.j */
/* loaded from: classes.dex */
public final class C1642j {

    /* renamed from: a */
    public static final int f7655a = 0;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 < r2) goto La
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lb
        La:
            r2 = 0
        Lb:
            p072e7.C1642j.f7655a = r2
            r2 = 31
            if (r0 < r2) goto L12
            goto L2a
        L12:
            r2 = 30
            if (r0 < r2) goto L2a
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r2 = r0.length()
            r3 = 1
            if (r2 != r3) goto L2a
            char r2 = r0.charAt(r1)
            r3 = 83
            if (r2 < r3) goto L2a
            r0.charAt(r1)
        L2a:
            return
    }
}
