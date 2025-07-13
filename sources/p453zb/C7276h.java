package p453zb;

/* renamed from: zb.h */
/* loaded from: classes.dex */
public final class C7276h {

    /* renamed from: a */
    public static final java.lang.String f27929a = null;

    /* renamed from: b */
    public static final boolean f27930b = false;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r0 = r0.name()
            p453zb.C7276h.f27929a = r0
            java.lang.String r1 = "SJIS"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L1d
            java.lang.String r1 = "EUC_JP"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            p453zb.C7276h.f27930b = r0
            return
    }
}
