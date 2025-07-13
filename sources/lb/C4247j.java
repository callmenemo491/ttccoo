package lb;

/* renamed from: lb.j */
/* loaded from: classes.dex */
public class C4247j implements lb.InterfaceC4256s<java.lang.Object> {

    /* renamed from: a */
    public final /* synthetic */ java.lang.reflect.Type f17424a;

    public C4247j(lb.C4244g r1, java.lang.reflect.Type r2) {
            r0 = this;
            r0.f17424a = r2
            r0.<init>()
            return
    }

    @Override // lb.InterfaceC4256s
    /* renamed from: a */
    public java.lang.Object mo9554a() {
            r3 = this;
            java.lang.reflect.Type r0 = r3.f17424a
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            java.lang.String r2 = "Invalid EnumSet type: "
            if (r1 == 0) goto L33
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L1c
            java.lang.Class r0 = (java.lang.Class) r0
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            return r0
        L1c:
            jb.q r0 = new jb.q
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.reflect.Type r2 = r3.f17424a
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            jb.q r0 = new jb.q
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.reflect.Type r2 = r3.f17424a
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
