package com.google.android.datatransport.runtime.scheduling.jobscheduling;

@com.google.auto.value.AutoValue
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
/* loaded from: classes.dex */
public abstract class AbstractC1044c {

    @com.google.auto.value.AutoValue
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a */
    public static abstract class a {

        @com.google.auto.value.AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC7371a {
            public AbstractC7371a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* renamed from: a */
            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a mo2815a();

            /* renamed from: b */
            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.AbstractC7371a mo2816b(long r1);

            /* renamed from: c */
            public abstract com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.AbstractC7371a mo2817c(long r1);
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public static com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.AbstractC7371a m2819a() {
                com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b
                r0.<init>()
                java.util.Set r1 = java.util.Collections.emptySet()
                java.lang.String r2 = "Null flags"
                java.util.Objects.requireNonNull(r1, r2)
                r0.f5244c = r1
                return r0
        }

        /* renamed from: b */
        public abstract long mo2812b();

        /* renamed from: c */
        public abstract java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b> mo2813c();

        /* renamed from: d */
        public abstract long mo2814d();
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b */
    public enum b extends java.lang.Enum<com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b> {

        /* renamed from: Y */
        public static final com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b f5245Y = null;

        /* renamed from: Z */
        public static final com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b f5246Z = null;

        /* renamed from: a0 */
        public static final com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b f5247a0 = null;

        /* renamed from: b0 */
        public static final /* synthetic */ com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b[] f5248b0 = null;

        static {
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b
                java.lang.String r1 = "NETWORK_UNMETERED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b.f5245Y = r0
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b
                java.lang.String r3 = "DEVICE_IDLE"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b.f5246Z = r1
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b r3 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b
                java.lang.String r5 = "DEVICE_CHARGING"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b.f5247a0 = r3
                r5 = 3
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b[] r5 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b.f5248b0 = r5
                return
        }

        b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b> r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b r1 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b) r1
                return r1
        }

        public static com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b[] values() {
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b[] r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b.f5248b0
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b[] r0 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b[]) r0
                return r0
        }
    }

    public AbstractC1044c() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract p050d4.InterfaceC1277a mo2810a();

    /* renamed from: b */
    public long m2818b(p335t3.EnumC6151d r9, long r10, int r12) {
            r8 = this;
            d4.a r0 = r8.mo2810a()
            long r0 = r0.mo3736a()
            long r10 = r10 - r0
            java.util.Map r0 = r8.mo2811c()
            java.lang.Object r9 = r0.get(r9)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a r9 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a) r9
            long r0 = r9.mo2812b()
            int r12 = r12 + (-1)
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L21
            r2 = r0
            goto L23
        L21:
            r2 = 2
        L23:
            r4 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r4 = java.lang.Math.log(r4)
            long r6 = (long) r12
            long r2 = r2 * r6
            double r2 = (double) r2
            double r2 = java.lang.Math.log(r2)
            double r4 = r4 / r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = java.lang.Math.max(r2, r4)
            r4 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r6 = (double) r12
            double r4 = java.lang.Math.pow(r4, r6)
            double r0 = (double) r0
            double r4 = r4 * r0
            double r4 = r4 * r2
            long r0 = (long) r4
            long r10 = java.lang.Math.max(r0, r10)
            long r0 = r9.mo2814d()
            long r9 = java.lang.Math.min(r10, r0)
            return r9
    }

    /* renamed from: c */
    public abstract java.util.Map<p335t3.EnumC6151d, com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a> mo2811c();
}
