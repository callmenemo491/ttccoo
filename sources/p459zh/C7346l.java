package p459zh;

/* renamed from: zh.l */
/* loaded from: classes.dex */
public final class C7346l {

    /* renamed from: a */
    public static final p379vh.AbstractC6714k1 f28106a = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            java.lang.String r0 = p074e9.C1805a.m4536u(r0)
            if (r0 != 0) goto L9
            goto Lc
        L9:
            java.lang.Boolean.parseBoolean(r0)
        Lc:
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L6f
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)     // Catch: java.lang.Throwable -> L6f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6f
            th.d r0 = th.C6251i.m12832D(r0)     // Catch: java.lang.Throwable -> L6f
            java.util.List r0 = th.C6249g.m12831E(r0)     // Catch: java.lang.Throwable -> L6f
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto L2e
            r1 = 0
            goto L57
        L2e:
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6f
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto L3a
        L38:
            r1 = r2
            goto L57
        L3a:
            r3 = r2
            kotlinx.coroutines.internal.MainDispatcherFactory r3 = (kotlinx.coroutines.internal.MainDispatcherFactory) r3     // Catch: java.lang.Throwable -> L6f
            int r3 = r3.getLoadPriority()     // Catch: java.lang.Throwable -> L6f
        L41:
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L6f
            r5 = r4
            kotlinx.coroutines.internal.MainDispatcherFactory r5 = (kotlinx.coroutines.internal.MainDispatcherFactory) r5     // Catch: java.lang.Throwable -> L6f
            int r5 = r5.getLoadPriority()     // Catch: java.lang.Throwable -> L6f
            if (r3 >= r5) goto L50
            r2 = r4
            r3 = r5
        L50:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r4 != 0) goto L41
            goto L38
        L57:
            kotlinx.coroutines.internal.MainDispatcherFactory r1 = (kotlinx.coroutines.internal.MainDispatcherFactory) r1     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L67
            vh.k1 r0 = r1.createDispatcher(r0)     // Catch: java.lang.Throwable -> L62
            p459zh.C7346l.f28106a = r0
            return
        L62:
            r0 = move-exception
            r1.hintOnError()     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L67:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L6f:
            r0 = move-exception
            throw r0
    }
}
