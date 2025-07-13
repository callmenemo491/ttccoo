package com.google.android.datatransport.runtime.backends;

@com.google.auto.value.AutoValue
/* renamed from: com.google.android.datatransport.runtime.backends.c */
/* loaded from: classes.dex */
public abstract class AbstractC1039c {

    /* renamed from: com.google.android.datatransport.runtime.backends.c$a */
    public enum a extends java.lang.Enum<com.google.android.datatransport.runtime.backends.AbstractC1039c.a> {

        /* renamed from: Y */
        public static final com.google.android.datatransport.runtime.backends.AbstractC1039c.a f5231Y = null;

        /* renamed from: Z */
        public static final com.google.android.datatransport.runtime.backends.AbstractC1039c.a f5232Z = null;

        /* renamed from: a0 */
        public static final com.google.android.datatransport.runtime.backends.AbstractC1039c.a f5233a0 = null;

        /* renamed from: b0 */
        public static final /* synthetic */ com.google.android.datatransport.runtime.backends.AbstractC1039c.a[] f5234b0 = null;

        static {
                com.google.android.datatransport.runtime.backends.c$a r0 = new com.google.android.datatransport.runtime.backends.c$a
                java.lang.String r1 = "OK"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.datatransport.runtime.backends.AbstractC1039c.a.f5231Y = r0
                com.google.android.datatransport.runtime.backends.c$a r1 = new com.google.android.datatransport.runtime.backends.c$a
                java.lang.String r3 = "TRANSIENT_ERROR"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.android.datatransport.runtime.backends.AbstractC1039c.a.f5232Z = r1
                com.google.android.datatransport.runtime.backends.c$a r3 = new com.google.android.datatransport.runtime.backends.c$a
                java.lang.String r5 = "FATAL_ERROR"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.android.datatransport.runtime.backends.AbstractC1039c.a.f5233a0 = r3
                r5 = 3
                com.google.android.datatransport.runtime.backends.c$a[] r5 = new com.google.android.datatransport.runtime.backends.AbstractC1039c.a[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.android.datatransport.runtime.backends.AbstractC1039c.a.f5234b0 = r5
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.datatransport.runtime.backends.AbstractC1039c.a valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.runtime.backends.c$a> r0 = com.google.android.datatransport.runtime.backends.AbstractC1039c.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.runtime.backends.c$a r1 = (com.google.android.datatransport.runtime.backends.AbstractC1039c.a) r1
                return r1
        }

        public static com.google.android.datatransport.runtime.backends.AbstractC1039c.a[] values() {
                com.google.android.datatransport.runtime.backends.c$a[] r0 = com.google.android.datatransport.runtime.backends.AbstractC1039c.a.f5234b0
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.runtime.backends.c$a[] r0 = (com.google.android.datatransport.runtime.backends.AbstractC1039c.a[]) r0
                return r0
        }
    }

    public AbstractC1039c() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static com.google.android.datatransport.runtime.backends.AbstractC1039c m2805a() {
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a
            com.google.android.datatransport.runtime.backends.c$a r1 = com.google.android.datatransport.runtime.backends.AbstractC1039c.a.f5233a0
            r2 = -1
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: b */
    public abstract long mo2801b();

    /* renamed from: c */
    public abstract com.google.android.datatransport.runtime.backends.AbstractC1039c.a mo2802c();
}
