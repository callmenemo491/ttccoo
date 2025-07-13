package p323s3;

import p323s3.C5950d.a;

/* renamed from: s3.d */
/* loaded from: classes.dex */
public class C5950d<T extends p323s3.C5950d.a> {

    /* renamed from: g */
    public static int f22840g;

    /* renamed from: a */
    public int f22841a;

    /* renamed from: b */
    public int f22842b;

    /* renamed from: c */
    public java.lang.Object[] f22843c;

    /* renamed from: d */
    public int f22844d;

    /* renamed from: e */
    public T f22845e;

    /* renamed from: f */
    public float f22846f;

    /* renamed from: s3.d$a */
    public static abstract class a {

        /* renamed from: a */
        public int f22847a;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f22847a = r0
                return
        }

        /* renamed from: a */
        public abstract p323s3.C5950d.a mo12357a();
    }

    public C5950d(int r1, T r2) {
            r0 = this;
            r0.<init>()
            if (r1 <= 0) goto L18
            r0.f22842b = r1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f22843c = r1
            r1 = 0
            r0.f22844d = r1
            r0.f22845e = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f22846f = r1
            r0.m12364d()
            return
        L18:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Object Pool must be instantiated with a capacity greater than 0!"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: a */
    public static synchronized p323s3.C5950d m12361a(int r2, p323s3.C5950d.a r3) {
            java.lang.Class<s3.d> r0 = p323s3.C5950d.class
            monitor-enter(r0)
            s3.d r1 = new s3.d     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L12
            int r2 = p323s3.C5950d.f22840g     // Catch: java.lang.Throwable -> L12
            r1.f22841a = r2     // Catch: java.lang.Throwable -> L12
            int r2 = r2 + 1
            p323s3.C5950d.f22840g = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    /* renamed from: b */
    public synchronized T m12362b() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f22844d     // Catch: java.lang.Throwable -> L20
            r1 = -1
            if (r0 != r1) goto L10
            float r0 = r3.f22846f     // Catch: java.lang.Throwable -> L20
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L10
            r3.m12364d()     // Catch: java.lang.Throwable -> L20
        L10:
            java.lang.Object[] r0 = r3.f22843c     // Catch: java.lang.Throwable -> L20
            int r2 = r3.f22844d     // Catch: java.lang.Throwable -> L20
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L20
            s3.d$a r0 = (p323s3.C5950d.a) r0     // Catch: java.lang.Throwable -> L20
            r0.f22847a = r1     // Catch: java.lang.Throwable -> L20
            int r2 = r2 + (-1)
            r3.f22844d = r2     // Catch: java.lang.Throwable -> L20
            monitor-exit(r3)
            return r0
        L20:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    /* renamed from: c */
    public synchronized void m12363c(T r5) {
            r4 = this;
            monitor-enter(r4)
            int r0 = r5.f22847a     // Catch: java.lang.Throwable -> L5d
            r1 = -1
            if (r0 == r1) goto L30
            int r1 = r4.f22841a     // Catch: java.lang.Throwable -> L5d
            if (r0 != r1) goto L12
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "The object passed is already stored in this pool!"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            throw r5     // Catch: java.lang.Throwable -> L5d
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "The object to recycle already belongs to poolId "
            r1.append(r2)     // Catch: java.lang.Throwable -> L5d
            int r5 = r5.f22847a     // Catch: java.lang.Throwable -> L5d
            r1.append(r5)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = ".  Object cannot belong to two different pool instances simultaneously!"
            r1.append(r5)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Throwable -> L5d
        L30:
            int r0 = r4.f22844d     // Catch: java.lang.Throwable -> L5d
            int r0 = r0 + 1
            r4.f22844d = r0     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r1 = r4.f22843c     // Catch: java.lang.Throwable -> L5d
            int r1 = r1.length     // Catch: java.lang.Throwable -> L5d
            if (r0 < r1) goto L51
            int r0 = r4.f22842b     // Catch: java.lang.Throwable -> L5d
            int r1 = r0 * 2
            r4.f22842b = r1     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5d
            r2 = 0
        L44:
            if (r2 >= r0) goto L4f
            java.lang.Object[] r3 = r4.f22843c     // Catch: java.lang.Throwable -> L5d
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L5d
            r1[r2] = r3     // Catch: java.lang.Throwable -> L5d
            int r2 = r2 + 1
            goto L44
        L4f:
            r4.f22843c = r1     // Catch: java.lang.Throwable -> L5d
        L51:
            int r0 = r4.f22841a     // Catch: java.lang.Throwable -> L5d
            r5.f22847a = r0     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r0 = r4.f22843c     // Catch: java.lang.Throwable -> L5d
            int r1 = r4.f22844d     // Catch: java.lang.Throwable -> L5d
            r0[r1] = r5     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r4)
            return
        L5d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    /* renamed from: d */
    public final void m12364d() {
            r5 = this;
            float r0 = r5.f22846f
            int r1 = r5.f22842b
            float r2 = (float) r1
            float r2 = r2 * r0
            int r0 = (int) r2
            r2 = 1
            if (r0 >= r2) goto Ld
            r1 = 1
            goto L11
        Ld:
            if (r0 <= r1) goto L10
            goto L11
        L10:
            r1 = r0
        L11:
            r0 = 0
        L12:
            if (r0 >= r1) goto L21
            java.lang.Object[] r3 = r5.f22843c
            T extends s3.d$a r4 = r5.f22845e
            s3.d$a r4 = r4.mo12357a()
            r3[r0] = r4
            int r0 = r0 + 1
            goto L12
        L21:
            int r1 = r1 - r2
            r5.f22844d = r1
            return
    }

    /* renamed from: e */
    public void m12365e(float r4) {
            r3 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 <= 0) goto La
            r4 = 1065353216(0x3f800000, float:1.0)
            goto Lf
        La:
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lf
            r4 = 0
        Lf:
            r3.f22846f = r4
            return
    }
}
