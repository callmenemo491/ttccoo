package p274pb;

/* renamed from: pb.a */
/* loaded from: classes.dex */
public class C5380a<T> {

    /* renamed from: a */
    public final java.lang.Class<? super T> f21381a;

    /* renamed from: b */
    public final java.lang.reflect.Type f21382b;

    /* renamed from: c */
    public final int f21383c;

    public C5380a() {
            r2 = this;
            r2.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L2b
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            java.lang.reflect.Type r0 = lb.C4238a.m9545a(r0)
            r2.f21382b = r0
            java.lang.Class r1 = lb.C4238a.m9549e(r0)
            r2.f21381a = r1
            int r0 = r0.hashCode()
            r2.f21383c = r0
            return
        L2b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Missing type parameter."
            r0.<init>(r1)
            throw r0
    }

    public C5380a(java.lang.reflect.Type r2) {
            r1 = this;
            r1.<init>()
            java.util.Objects.requireNonNull(r2)
            java.lang.reflect.Type r2 = lb.C4238a.m9545a(r2)
            r1.f21382b = r2
            java.lang.Class r0 = lb.C4238a.m9549e(r2)
            r1.f21381a = r0
            int r2 = r2.hashCode()
            r1.f21383c = r2
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p274pb.C5380a
            if (r0 == 0) goto L12
            java.lang.reflect.Type r0 = r1.f21382b
            pb.a r2 = (p274pb.C5380a) r2
            java.lang.reflect.Type r2 = r2.f21382b
            boolean r2 = lb.C4238a.m9547c(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f21383c
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.f21382b
            java.lang.String r0 = lb.C4238a.m9553i(r0)
            return r0
    }
}
