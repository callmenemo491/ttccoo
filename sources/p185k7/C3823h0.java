package p185k7;

/* renamed from: k7.h0 */
/* loaded from: classes.dex */
public final class C3823h0 {

    /* renamed from: a */
    public static final int f16658a = 0;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r2 = 0
            r3 = 31
            if (r0 < r3) goto La
            goto L29
        La:
            r3 = 30
            if (r0 < r3) goto L28
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r3 = r0.length()
            r4 = 1
            if (r3 != r4) goto L28
            char r3 = r0.charAt(r2)
            r4 = 83
            if (r3 < r4) goto L28
            char r0 = r0.charAt(r2)
            r3 = 90
            if (r0 > r3) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            p185k7.C3823h0.f16658a = r1
            return
    }
}
