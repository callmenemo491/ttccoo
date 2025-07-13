package lb;

/* renamed from: lb.u */
/* loaded from: classes.dex */
public class C4258u extends lb.AbstractC4261x {

    /* renamed from: a */
    public final /* synthetic */ java.lang.reflect.Method f17460a;

    /* renamed from: b */
    public final /* synthetic */ int f17461b;

    public C4258u(java.lang.reflect.Method r1, int r2) {
            r0 = this;
            r0.f17460a = r1
            r0.f17461b = r2
            r0.<init>()
            return
    }

    @Override // lb.AbstractC4261x
    /* renamed from: b */
    public <T> T mo9567b(java.lang.Class<T> r4) {
            r3 = this;
            lb.AbstractC4261x.m9568a(r4)
            java.lang.reflect.Method r0 = r3.f17460a
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            int r4 = r3.f17461b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2 = 1
            r1[r2] = r4
            r4 = 0
            java.lang.Object r4 = r0.invoke(r4, r1)
            return r4
    }
}
