package p064e;

/* renamed from: e.b */
/* loaded from: classes.dex */
public class C1488b {
    /* renamed from: a */
    public static void m4034a(java.lang.Object r2, java.lang.StringBuilder r3) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "null"
            goto L39
        L5:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L29
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L29
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L29:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
        L39:
            r3.append(r2)
            return
    }

    /* renamed from: b */
    public static final p379vh.AbstractC6755z m4035b(p179k1.AbstractC3664v r3) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f16198l
            java.lang.String r1 = "backingFieldMap"
            p214m2.C4339q.m9705j(r0, r1)
            java.lang.String r1 = "QueryDispatcher"
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L1d
            java.util.concurrent.Executor r3 = r3.f16188b
            java.lang.String r2 = "queryExecutor"
            p214m2.C4339q.m9705j(r3, r2)
            vh.z r2 = p101fh.C2174f.m5719i(r3)
            r0.put(r1, r2)
        L1d:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher"
            java.util.Objects.requireNonNull(r2, r3)
            vh.z r2 = (p379vh.AbstractC6755z) r2
            return r2
    }

    /* renamed from: c */
    public static final p379vh.AbstractC6755z m4036c(p179k1.AbstractC3664v r3) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f16198l
            java.lang.String r1 = "backingFieldMap"
            p214m2.C4339q.m9705j(r0, r1)
            java.lang.String r1 = "TransactionDispatcher"
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L1d
            java.util.concurrent.Executor r3 = r3.f16189c
            java.lang.String r2 = "transactionExecutor"
            p214m2.C4339q.m9705j(r3, r2)
            vh.z r2 = p101fh.C2174f.m5719i(r3)
            r0.put(r1, r2)
        L1d:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher"
            java.util.Objects.requireNonNull(r2, r3)
            vh.z r2 = (p379vh.AbstractC6755z) r2
            return r2
    }

    /* renamed from: d */
    public static final p379vh.InterfaceC6686b0 m4037d(androidx.lifecycle.AbstractC0457n0 r4) {
            java.lang.String r0 = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY"
            java.lang.Object r1 = r4.m1452a(r0)
            vh.b0 r1 = (p379vh.InterfaceC6686b0) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            androidx.lifecycle.g r1 = new androidx.lifecycle.g
            r2 = 0
            r3 = 1
            vh.r r2 = p209lh.C4304a.m9607a(r2, r3)
            vh.z r3 = p379vh.C6716l0.f26007a
            vh.k1 r3 = p459zh.C7346l.f28106a
            vh.k1 r3 = r3.mo13640z0()
            vh.g1 r2 = (p379vh.C6702g1) r2
            fh.g r2 = p101fh.InterfaceC2175g.a.C7391a.m5740d(r2, r3)
            r1.<init>(r2)
            java.lang.Object r4 = r4.m1453c(r0, r1)
            java.lang.String r0 = "setTagIfAbsent(\n        \u2026Main.immediate)\n        )"
            p214m2.C4339q.m9705j(r4, r0)
            vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
            return r4
    }
}
