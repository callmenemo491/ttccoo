package p248o6;

/* renamed from: o6.i */
/* loaded from: classes.dex */
public abstract class AbstractC4912i {

    /* renamed from: a */
    public static final java.lang.Object f19496a = null;

    /* renamed from: b */
    public static p248o6.AbstractC4912i f19497b;

    /* renamed from: o6.i$a */
    public static final class a {

        /* renamed from: e */
        public static final android.net.Uri f19498e = null;

        /* renamed from: a */
        public final java.lang.String f19499a;

        /* renamed from: b */
        public final java.lang.String f19500b;

        /* renamed from: c */
        public final int f19501c;

        /* renamed from: d */
        public final boolean f19502d;

        static {
                android.net.Uri$Builder r0 = new android.net.Uri$Builder
                r0.<init>()
                java.lang.String r1 = "content"
                android.net.Uri$Builder r0 = r0.scheme(r1)
                java.lang.String r1 = "com.google.android.gms.chimera"
                android.net.Uri$Builder r0 = r0.authority(r1)
                android.net.Uri r0 = r0.build()
                p248o6.AbstractC4912i.a.f19498e = r0
                return
        }

        public a(java.lang.String r1, java.lang.String r2, int r3, boolean r4) {
                r0 = this;
                r0.<init>()
                com.google.android.gms.common.internal.C1101a.m3100e(r1)
                r0.f19499a = r1
                com.google.android.gms.common.internal.C1101a.m3100e(r2)
                r0.f19500b = r2
                r0.f19501c = r3
                r0.f19502d = r4
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p248o6.AbstractC4912i.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                o6.i$a r5 = (p248o6.AbstractC4912i.a) r5
                java.lang.String r1 = r4.f19499a
                java.lang.String r3 = r5.f19499a
                boolean r1 = p248o6.C4924o.m11074a(r1, r3)
                if (r1 == 0) goto L34
                java.lang.String r1 = r4.f19500b
                java.lang.String r3 = r5.f19500b
                boolean r1 = p248o6.C4924o.m11074a(r1, r3)
                if (r1 == 0) goto L34
                r1 = 0
                boolean r1 = p248o6.C4924o.m11074a(r1, r1)
                if (r1 == 0) goto L34
                int r1 = r4.f19501c
                int r3 = r5.f19501c
                if (r1 != r3) goto L34
                boolean r1 = r4.f19502d
                boolean r5 = r5.f19502d
                if (r1 != r5) goto L34
                return r0
            L34:
                return r2
        }

        public final int hashCode() {
                r3 = this;
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = r3.f19499a
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = r3.f19500b
                r2 = 1
                r0[r2] = r1
                r1 = 2
                r2 = 0
                r0[r1] = r2
                int r1 = r3.f19501c
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 3
                r0[r2] = r1
                boolean r1 = r3.f19502d
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 4
                r0[r2] = r1
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f19499a
                if (r0 == 0) goto L5
                return r0
            L5:
                r0 = 0
                java.lang.String r1 = "null reference"
                java.util.Objects.requireNonNull(r0, r1)
                throw r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p248o6.AbstractC4912i.f19496a = r0
            return
    }

    public AbstractC4912i() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public static p248o6.AbstractC4912i m11066a(@androidx.annotation.RecentlyNonNull android.content.Context r2) {
            java.lang.Object r0 = p248o6.AbstractC4912i.f19496a
            monitor-enter(r0)
            o6.i r1 = p248o6.AbstractC4912i.f19497b     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L12
            o6.l0 r1 = new o6.l0     // Catch: java.lang.Throwable -> L16
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            p248o6.AbstractC4912i.f19497b = r1     // Catch: java.lang.Throwable -> L16
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            o6.i r2 = p248o6.AbstractC4912i.f19497b
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    /* renamed from: b */
    public abstract boolean mo11067b(p248o6.AbstractC4912i.a r1, android.content.ServiceConnection r2, java.lang.String r3);

    /* renamed from: c */
    public abstract void mo11068c(p248o6.AbstractC4912i.a r1, android.content.ServiceConnection r2, java.lang.String r3);
}
