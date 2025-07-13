package p162j4;

/* renamed from: j4.m */
/* loaded from: classes.dex */
public final class C3408m {
    /* renamed from: a */
    public static boolean m7837a(java.lang.Throwable r0) {
            boolean r0 = r0 instanceof android.media.MediaDrm.MediaDrmStateException
            return r0
    }

    /* renamed from: b */
    public static int m7838b(java.lang.Throwable r5) {
            android.media.MediaDrm$MediaDrmStateException r5 = (android.media.MediaDrm.MediaDrmStateException) r5
            java.lang.String r5 = r5.getDiagnosticInfo()
            int r0 = p371v5.C6552b0.f25624a
            r0 = 0
            if (r5 != 0) goto Lc
            goto L37
        Lc:
            java.lang.String r1 = "_"
            r2 = -1
            java.lang.String[] r5 = r5.split(r1, r2)
            int r1 = r5.length
            r2 = 2
            if (r1 >= r2) goto L18
            goto L37
        L18:
            int r3 = r1 + (-1)
            r3 = r5[r3]
            r4 = 3
            if (r1 < r4) goto L2c
            int r1 = r1 - r2
            r5 = r5[r1]
            java.lang.String r1 = "neg"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = 0
        L2d:
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.NumberFormatException -> L37
            int r0 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L37
            if (r5 == 0) goto L37
            int r0 = -r0
        L37:
            int r5 = p371v5.C6552b0.m13323p(r0)
            return r5
    }
}
