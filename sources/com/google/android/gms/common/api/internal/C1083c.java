package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes.dex */
public final class C1083c<L> {

    /* renamed from: a */
    public volatile L f5596a;

    /* renamed from: b */
    public volatile com.google.android.gms.common.api.internal.C1083c.a<L> f5597b;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public static final class a<L> {

        /* renamed from: a */
        public final L f5598a;

        /* renamed from: b */
        public final java.lang.String f5599b;

        public a(L r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f5598a = r1
                r0.f5599b = r2
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.gms.common.api.internal.C1083c.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.gms.common.api.internal.c$a r5 = (com.google.android.gms.common.api.internal.C1083c.a) r5
                L r1 = r4.f5598a
                L r3 = r5.f5598a
                if (r1 != r3) goto L1d
                java.lang.String r1 = r4.f5599b
                java.lang.String r5 = r5.f5599b
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L1d
                return r0
            L1d:
                return r2
        }

        public final int hashCode() {
                r2 = this;
                L r0 = r2.f5598a
                int r0 = java.lang.System.identityHashCode(r0)
                int r0 = r0 * 31
                java.lang.String r1 = r2.f5599b
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.c$b */
    public interface b<L> {
        /* renamed from: a */
        void m3084a(@androidx.annotation.RecentlyNonNull L r1);

        /* renamed from: b */
        void m3085b();
    }

    /* renamed from: com.google.android.gms.common.api.internal.c$c */
    public final class c extends p053d7.HandlerC1343e {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.gms.common.api.internal.C1083c f5600a;

        public c(com.google.android.gms.common.api.internal.C1083c r1, android.os.Looper r2) {
                r0 = this;
                r0.f5600a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 != r1) goto L6
                goto L7
            L6:
                r1 = 0
            L7:
                com.google.android.gms.common.internal.C1101a.m3096a(r1)
                java.lang.Object r3 = r3.obj
                com.google.android.gms.common.api.internal.c$b r3 = (com.google.android.gms.common.api.internal.C1083c.b) r3
                com.google.android.gms.common.api.internal.c r0 = r2.f5600a
                L r0 = r0.f5596a
                if (r0 != 0) goto L18
                r3.m3085b()
                goto L1b
            L18:
                r3.m3084a(r0)     // Catch: java.lang.RuntimeException -> L1c
            L1b:
                return
            L1c:
                r0 = move-exception
                r3.m3085b()
                throw r0
        }
    }

    public C1083c(android.os.Looper r2, L r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.api.internal.c$c r0 = new com.google.android.gms.common.api.internal.c$c
            r0.<init>(r1, r2)
            r1.f5596a = r3
            com.google.android.gms.common.api.internal.c$a r2 = new com.google.android.gms.common.api.internal.c$a
            com.google.android.gms.common.internal.C1101a.m3100e(r4)
            r2.<init>(r3, r4)
            r1.f5597b = r2
            return
    }
}
