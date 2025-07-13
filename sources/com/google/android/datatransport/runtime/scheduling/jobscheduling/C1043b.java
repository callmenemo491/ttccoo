package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
/* loaded from: classes.dex */
public final class C1043b extends com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a {

    /* renamed from: a */
    public final long f5239a;

    /* renamed from: b */
    public final long f5240b;

    /* renamed from: c */
    public final java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b> f5241c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b */
    public static final class b extends com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.AbstractC7371a {

        /* renamed from: a */
        public java.lang.Long f5242a;

        /* renamed from: b */
        public java.lang.Long f5243b;

        /* renamed from: c */
        public java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b> f5244c;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.AbstractC7371a
        /* renamed from: a */
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a mo2815a() {
                r9 = this;
                java.lang.Long r0 = r9.f5242a
                if (r0 != 0) goto L7
                java.lang.String r0 = " delta"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                java.lang.Long r1 = r9.f5243b
                if (r1 != 0) goto L13
                java.lang.String r1 = " maxAllowedDelay"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L13:
                java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b> r1 = r9.f5244c
                if (r1 != 0) goto L1d
                java.lang.String r1 = " flags"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L1d:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L39
                com.google.android.datatransport.runtime.scheduling.jobscheduling.b r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.b
                java.lang.Long r1 = r9.f5242a
                long r3 = r1.longValue()
                java.lang.Long r1 = r9.f5243b
                long r5 = r1.longValue()
                java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b> r7 = r9.f5244c
                r8 = 0
                r2 = r0
                r2.<init>(r3, r5, r7, r8)
                return r0
            L39:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.AbstractC7371a
        /* renamed from: b */
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.AbstractC7371a mo2816b(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.f5242a = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.AbstractC7371a
        /* renamed from: c */
        public com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.AbstractC7371a mo2817c(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.f5243b = r1
                return r0
        }
    }

    public C1043b(long r1, long r3, java.util.Set r5, com.google.android.datatransport.runtime.scheduling.jobscheduling.C1043b.a r6) {
            r0 = this;
            r0.<init>()
            r0.f5239a = r1
            r0.f5240b = r3
            r0.f5241c = r5
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a
    /* renamed from: b */
    public long mo2812b() {
            r2 = this;
            long r0 = r2.f5239a
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a
    /* renamed from: c */
    public java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b> mo2813c() {
            r1 = this;
            java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b> r0 = r1.f5241c
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a
    /* renamed from: d */
    public long mo2814d() {
            r2 = this;
            long r0 = r2.f5240b
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a
            r2 = 0
            if (r1 == 0) goto L2e
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a r8 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a) r8
            long r3 = r7.f5239a
            long r5 = r8.mo2812b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2c
            long r3 = r7.f5240b
            long r5 = r8.mo2814d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2c
            java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b> r1 = r7.f5241c
            java.util.Set r8 = r8.mo2813c()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
        L2e:
            return r2
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.f5239a
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            long r3 = r7.f5240b
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b> r0 = r7.f5241c
            int r0 = r0.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ConfigValue{delta="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.f5239a
            r0.append(r1)
            java.lang.String r1 = ", maxAllowedDelay="
            r0.append(r1)
            long r1 = r3.f5240b
            r0.append(r1)
            java.lang.String r1 = ", flags="
            r0.append(r1)
            java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b> r1 = r3.f5241c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
