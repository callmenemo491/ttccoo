package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
/* loaded from: classes.dex */
public final class C1042a extends com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c {

    /* renamed from: a */
    public final p050d4.InterfaceC1277a f5237a;

    /* renamed from: b */
    public final java.util.Map<p335t3.EnumC6151d, com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a> f5238b;

    public C1042a(p050d4.InterfaceC1277a r2, java.util.Map<p335t3.EnumC6151d, com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a> r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null clock"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f5237a = r2
            java.lang.String r2 = "Null values"
            java.util.Objects.requireNonNull(r3, r2)
            r1.f5238b = r3
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c
    /* renamed from: a */
    public p050d4.InterfaceC1277a mo2810a() {
            r1 = this;
            d4.a r0 = r1.f5237a
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c
    /* renamed from: c */
    public java.util.Map<p335t3.EnumC6151d, com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a> mo2811c() {
            r1 = this;
            java.util.Map<t3.d, com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a> r0 = r1.f5238b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c
            r2 = 0
            if (r1 == 0) goto L26
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c r5 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c) r5
            d4.a r1 = r4.f5237a
            d4.a r3 = r5.mo2810a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            java.util.Map<t3.d, com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a> r1 = r4.f5238b
            java.util.Map r5 = r5.mo2811c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
        L26:
            return r2
    }

    public int hashCode() {
            r2 = this;
            d4.a r0 = r2.f5237a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.Map<t3.d, com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a> r1 = r2.f5238b
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "SchedulerConfig{clock="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            d4.a r1 = r2.f5237a
            r0.append(r1)
            java.lang.String r1 = ", values="
            r0.append(r1)
            java.util.Map<t3.d, com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a> r1 = r2.f5238b
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
