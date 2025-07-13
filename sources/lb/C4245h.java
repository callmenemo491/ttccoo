package lb;

/* renamed from: lb.h */
/* loaded from: classes.dex */
public class C4245h implements lb.InterfaceC4256s<java.lang.Object> {

    /* renamed from: a */
    public final /* synthetic */ java.lang.reflect.Constructor f17423a;

    public C4245h(lb.C4244g r1, java.lang.reflect.Constructor r2) {
            r0 = this;
            r0.f17423a = r2
            r0.<init>()
            return
    }

    @Override // lb.InterfaceC4256s
    /* renamed from: a */
    public java.lang.Object mo9554a() {
            r5 = this;
            java.lang.String r0 = " with no args"
            java.lang.String r1 = "Failed to invoke "
            r2 = 0
            java.lang.reflect.Constructor r3 = r5.f17423a     // Catch: java.lang.IllegalAccessException -> Lc java.lang.reflect.InvocationTargetException -> L13 java.lang.InstantiationException -> L2e
            java.lang.Object r0 = r3.newInstance(r2)     // Catch: java.lang.IllegalAccessException -> Lc java.lang.reflect.InvocationTargetException -> L13 java.lang.InstantiationException -> L2e
            return r0
        Lc:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L13:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.reflect.Constructor r4 = r5.f17423a
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Throwable r1 = r2.getTargetException()
            r3.<init>(r0, r1)
            throw r3
        L2e:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.reflect.Constructor r4 = r5.f17423a
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0, r2)
            throw r3
    }
}
