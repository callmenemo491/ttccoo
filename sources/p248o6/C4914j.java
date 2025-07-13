package p248o6;

/* renamed from: o6.j */
/* loaded from: classes.dex */
public final class C4914j {

    /* renamed from: a */
    public final java.lang.String f19507a;

    /* renamed from: b */
    public final java.lang.String f19508b;

    public C4914j(@androidx.annotation.RecentlyNonNull java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "log tag cannot be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r6, r0)
            int r0 = r6.length()
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 > r3) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r4[r1] = r2
            if (r0 == 0) goto L34
            r5.f19507a = r6
            if (r7 == 0) goto L30
            int r6 = r7.length()
            if (r6 > 0) goto L2d
            goto L30
        L2d:
            r5.f19508b = r7
            return
        L30:
            r6 = 0
            r5.f19508b = r6
            return
        L34:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "tag \"%s\" is longer than the %d character maximum"
            java.lang.String r7 = java.lang.String.format(r7, r4)
            r6.<init>(r7)
            throw r6
    }

    /* renamed from: a */
    public final boolean m11069a(int r2) {
            r1 = this;
            java.lang.String r0 = r1.f19507a
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            return r2
    }
}
