package p095fb;

/* renamed from: fb.b */
/* loaded from: classes.dex */
public class C2132b implements p095fb.InterfaceC2137g {

    /* renamed from: a */
    public final java.lang.String f9827a;

    /* renamed from: b */
    public final p095fb.C2133c f9828b;

    public C2132b(java.util.Set<p095fb.AbstractC2134d> r1, p095fb.C2133c r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = m5693b(r1)
            r0.f9827a = r1
            r0.f9828b = r2
            return
    }

    /* renamed from: b */
    public static java.lang.String m5693b(java.util.Set<p095fb.AbstractC2134d> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r3.next()
            fb.d r1 = (p095fb.AbstractC2134d) r1
            java.lang.String r2 = r1.mo5691a()
            r0.append(r2)
            r2 = 47
            r0.append(r2)
            java.lang.String r1 = r1.mo5692b()
            r0.append(r1)
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L9
            r1 = 32
            r0.append(r1)
            goto L9
        L34:
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // p095fb.InterfaceC2137g
    /* renamed from: a */
    public java.lang.String mo5694a() {
            r3 = this;
            fb.c r0 = r3.f9828b
            java.util.Set<fb.d> r1 = r0.f9830a
            monitor-enter(r1)
            java.util.Set<fb.d> r0 = r0.f9830a     // Catch: java.lang.Throwable -> L3f
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            java.lang.String r0 = r3.f9827a
            return r0
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f9827a
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            fb.c r1 = r3.f9828b
            java.util.Set<fb.d> r2 = r1.f9830a
            monitor-enter(r2)
            java.util.Set<fb.d> r1 = r1.f9830a     // Catch: java.lang.Throwable -> L3c
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = m5693b(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r0
        L3f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            throw r0
    }
}
