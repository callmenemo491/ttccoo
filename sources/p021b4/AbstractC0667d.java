package p021b4;

@com.google.auto.value.AutoValue
/* renamed from: b4.d */
/* loaded from: classes.dex */
public abstract class AbstractC0667d {

    /* renamed from: a */
    public static final p021b4.AbstractC0667d f3834a = null;

    static {
            r0 = 10485760(0xa00000, double:5.180654E-317)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 604800000(0x240c8400, double:2.988109026E-315)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 81920(0x14000, float:1.14794E-40)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            if (r0 != 0) goto L26
            java.lang.String r5 = " maxStorageSizeInBytes"
            goto L28
        L26:
            java.lang.String r5 = ""
        L28:
            if (r1 != 0) goto L30
            java.lang.String r6 = " loadBatchSize"
            java.lang.String r5 = p064e.C1493g.m4049a(r5, r6)
        L30:
            if (r2 != 0) goto L38
            java.lang.String r6 = " criticalSectionEnterTimeoutMs"
            java.lang.String r5 = p064e.C1493g.m4049a(r5, r6)
        L38:
            if (r3 != 0) goto L40
            java.lang.String r6 = " eventCleanUpAge"
            java.lang.String r5 = p064e.C1493g.m4049a(r5, r6)
        L40:
            if (r4 != 0) goto L48
            java.lang.String r6 = " maxBlobByteSizePerRow"
            java.lang.String r5 = p064e.C1493g.m4049a(r5, r6)
        L48:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L6c
            b4.a r5 = new b4.a
            long r8 = r0.longValue()
            int r10 = r1.intValue()
            int r11 = r2.intValue()
            long r12 = r3.longValue()
            int r14 = r4.intValue()
            r15 = 0
            r7 = r5
            r7.<init>(r8, r10, r11, r12, r14, r15)
            p021b4.AbstractC0667d.f3834a = r5
            return
        L6c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r1 = p064e.C1493g.m4049a(r1, r5)
            r0.<init>(r1)
            throw r0
    }

    public AbstractC0667d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract int mo2216a();

    /* renamed from: b */
    public abstract long mo2217b();

    /* renamed from: c */
    public abstract int mo2218c();

    /* renamed from: d */
    public abstract int mo2219d();

    /* renamed from: e */
    public abstract long mo2220e();
}
