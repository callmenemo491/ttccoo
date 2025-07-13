package p030c0;

/* renamed from: c0.p */
/* loaded from: classes.dex */
public class C0829p {

    /* renamed from: a */
    public static final java.lang.Object f4493a = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p030c0.C0829p.f4493a = r0
            return
    }

    /* renamed from: a */
    public static android.os.Bundle[] m2494a(p030c0.C0832s[] r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            int r1 = r6.length
            android.os.Bundle[] r1 = new android.os.Bundle[r1]
            r2 = 0
            r3 = 0
        L9:
            int r4 = r6.length
            if (r3 >= r4) goto L34
            r4 = r6[r3]
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.util.Objects.requireNonNull(r4)
            java.lang.String r4 = "resultKey"
            r5.putString(r4, r0)
            java.lang.String r4 = "label"
            r5.putCharSequence(r4, r0)
            java.lang.String r4 = "choices"
            r5.putCharSequenceArray(r4, r0)
            java.lang.String r4 = "allowFreeFormInput"
            r5.putBoolean(r4, r2)
            java.lang.String r4 = "extras"
            r5.putBundle(r4, r0)
            r1[r3] = r5
            int r3 = r3 + 1
            goto L9
        L34:
            return r1
    }
}
