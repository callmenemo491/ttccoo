package lb;

/* renamed from: lb.f */
/* loaded from: classes.dex */
public class C4243f implements lb.InterfaceC4256s<java.lang.Object> {

    /* renamed from: a */
    public final lb.AbstractC4261x f17414a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Class f17415b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.reflect.Type f17416c;

    public C4243f(lb.C4244g r7, java.lang.Class r8, java.lang.reflect.Type r9) {
            r6 = this;
            r6.f17415b = r8
            r6.f17416c = r9
            r6.<init>()
            java.lang.String r7 = "newInstance"
            r8 = 0
            r9 = 0
            r0 = 1
            java.lang.String r1 = "sun.misc.Unsafe"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "theUnsafe"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L31
            r2.setAccessible(r0)     // Catch: java.lang.Exception -> L31
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = "allocateInstance"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L31
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r4[r9] = r5     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch: java.lang.Exception -> L31
            lb.t r3 = new lb.t     // Catch: java.lang.Exception -> L31
            r3.<init>(r1, r2)     // Catch: java.lang.Exception -> L31
            goto L8a
        L31:
            r1 = 2
            java.lang.Class<java.io.ObjectStreamClass> r2 = java.io.ObjectStreamClass.class
            java.lang.String r3 = "getConstructorId"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L6c
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r4[r9] = r5     // Catch: java.lang.Exception -> L6c
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L6c
            r2.setAccessible(r0)     // Catch: java.lang.Exception -> L6c
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L6c
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r3[r9] = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Object r8 = r2.invoke(r8, r3)     // Catch: java.lang.Exception -> L6c
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Exception -> L6c
            int r8 = r8.intValue()     // Catch: java.lang.Exception -> L6c
            java.lang.Class<java.io.ObjectStreamClass> r2 = java.io.ObjectStreamClass.class
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6c
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r3[r9] = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L6c
            r3[r0] = r4     // Catch: java.lang.Exception -> L6c
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r7, r3)     // Catch: java.lang.Exception -> L6c
            r2.setAccessible(r0)     // Catch: java.lang.Exception -> L6c
            lb.u r3 = new lb.u     // Catch: java.lang.Exception -> L6c
            r3.<init>(r2, r8)     // Catch: java.lang.Exception -> L6c
            goto L8a
        L6c:
            java.lang.Class<java.io.ObjectInputStream> r8 = java.io.ObjectInputStream.class
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L85
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r1[r9] = r2     // Catch: java.lang.Exception -> L85
            java.lang.Class<java.lang.Class> r9 = java.lang.Class.class
            r1[r0] = r9     // Catch: java.lang.Exception -> L85
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r7, r1)     // Catch: java.lang.Exception -> L85
            r7.setAccessible(r0)     // Catch: java.lang.Exception -> L85
            lb.v r3 = new lb.v     // Catch: java.lang.Exception -> L85
            r3.<init>(r7)     // Catch: java.lang.Exception -> L85
            goto L8a
        L85:
            lb.w r3 = new lb.w
            r3.<init>()
        L8a:
            r6.f17414a = r3
            return
    }

    @Override // lb.InterfaceC4256s
    /* renamed from: a */
    public java.lang.Object mo9554a() {
            r4 = this;
            lb.x r0 = r4.f17414a     // Catch: java.lang.Exception -> L9
            java.lang.Class r1 = r4.f17415b     // Catch: java.lang.Exception -> L9
            java.lang.Object r0 = r0.mo9567b(r1)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to invoke no-args constructor for "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.reflect.Type r3 = r4.f17416c
            r2.append(r3)
            java.lang.String r3 = ". Registering an InstanceCreator with Gson for this type may fix this problem."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }
}
