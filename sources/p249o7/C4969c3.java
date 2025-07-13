package p249o7;

/* renamed from: o7.c3 */
/* loaded from: classes.dex */
public final class C4969c3 {

    /* renamed from: b */
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> f19615b = null;

    /* renamed from: c */
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> f19616c = null;

    /* renamed from: d */
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> f19617d = null;

    /* renamed from: a */
    public final com.google.android.gms.measurement.internal.C1114e f19618a;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            p249o7.C4969c3.f19615b = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            p249o7.C4969c3.f19616c = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            p249o7.C4969c3.f19617d = r0
            return
    }

    public C4969c3(com.google.android.gms.measurement.internal.C1114e r1) {
            r0 = this;
            r0.<init>()
            r0.f19618a = r1
            return
    }

    /* renamed from: g */
    public static final java.lang.String m11112g(java.lang.String r3, java.lang.String[] r4, java.lang.String[] r5, java.util.concurrent.atomic.AtomicReference<java.lang.String[]> r6) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            int r0 = r4.length
            int r1 = r5.length
            r2 = 0
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.android.gms.common.internal.C1101a.m3096a(r0)
        L10:
            int r0 = r4.length
            if (r2 >= r0) goto L55
            r0 = r4[r2]
            boolean r0 = com.google.android.gms.measurement.internal.C1115f.m3188Z(r3, r0)
            if (r0 == 0) goto L52
            monitor-enter(r6)
            java.lang.Object r3 = r6.get()     // Catch: java.lang.Throwable -> L4f
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L2a
            int r3 = r5.length     // Catch: java.lang.Throwable -> L4f
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L4f
            r6.set(r3)     // Catch: java.lang.Throwable -> L4f
        L2a:
            r0 = r3[r2]     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4f
            r5 = r5[r2]     // Catch: java.lang.Throwable -> L4f
            r0.append(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "("
            r0.append(r5)     // Catch: java.lang.Throwable -> L4f
            r4 = r4[r2]     // Catch: java.lang.Throwable -> L4f
            r0.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = ")"
            r0.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4f
            r3[r2] = r0     // Catch: java.lang.Throwable -> L4f
        L4d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4f
            return r0
        L4f:
            r3 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4f
            throw r3
        L52:
            int r2 = r2 + 1
            goto L10
        L55:
            return r3
    }

    /* renamed from: a */
    public final java.lang.String m11113a(java.lang.Object[] r7) {
            r6 = this;
            if (r7 != 0) goto L5
            java.lang.String r7 = "[]"
            return r7
        L5:
            java.lang.String r0 = "["
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r7.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L34
            r3 = r7[r2]
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L1c
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r3 = r6.m11114b(r3)
            goto L20
        L1c:
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L20:
            if (r3 == 0) goto L31
            int r4 = r0.length()
            r5 = 1
            if (r4 == r5) goto L2e
            java.lang.String r4 = ", "
            r0.append(r4)
        L2e:
            r0.append(r3)
        L31:
            int r2 = r2 + 1
            goto Ld
        L34:
            java.lang.String r7 = "]"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* renamed from: b */
    public final java.lang.String m11114b(android.os.Bundle r6) {
            r5 = this;
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            com.google.android.gms.measurement.internal.e r0 = r5.f19618a
            boolean r0 = r0.m3181g()
            if (r0 != 0) goto L11
            java.lang.String r6 = r6.toString()
            return r6
        L11:
            java.lang.String r0 = "Bundle[{"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r0.length()
            r4 = 8
            if (r3 == r4) goto L38
            java.lang.String r3 = ", "
            r0.append(r3)
        L38:
            java.lang.String r3 = r5.m11117e(r2)
            r0.append(r3)
            java.lang.String r3 = "="
            r0.append(r3)
            java.lang.Object r2 = r6.get(r2)
            boolean r3 = r2 instanceof android.os.Bundle
            if (r3 == 0) goto L57
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = r5.m11113a(r3)
            goto L75
        L57:
            boolean r3 = r2 instanceof java.lang.Object[]
            if (r3 == 0) goto L62
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.String r2 = r5.m11113a(r2)
            goto L75
        L62:
            boolean r3 = r2 instanceof java.util.ArrayList
            if (r3 == 0) goto L71
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object[] r2 = r2.toArray()
            java.lang.String r2 = r5.m11113a(r2)
            goto L75
        L71:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L75:
            r0.append(r2)
            goto L1f
        L79:
            java.lang.String r6 = "}]"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    /* renamed from: c */
    public final java.lang.String m11115c(p249o7.C5077q r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.e r0 = r2.f19618a
            boolean r0 = r0.m3181g()
            if (r0 != 0) goto Ld
            java.lang.String r3 = r3.toString()
            return r3
        Ld:
            java.lang.String r0 = "origin="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f19953a0
            r0.append(r1)
            java.lang.String r1 = ",name="
            r0.append(r1)
            java.lang.String r1 = r3.f19951Y
            java.lang.String r1 = r2.m11116d(r1)
            r0.append(r1)
            java.lang.String r1 = ",params="
            r0.append(r1)
            o7.o r3 = r3.f19952Z
            if (r3 != 0) goto L31
            r3 = 0
            goto L46
        L31:
            com.google.android.gms.measurement.internal.e r1 = r2.f19618a
            boolean r1 = r1.m3181g()
            if (r1 != 0) goto L3e
            java.lang.String r3 = r3.toString()
            goto L46
        L3e:
            android.os.Bundle r3 = r3.m11371X()
            java.lang.String r3 = r2.m11114b(r3)
        L46:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* renamed from: d */
    public final java.lang.String m11116d(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.google.android.gms.measurement.internal.e r0 = r3.f19618a
            boolean r0 = r0.m3181g()
            if (r0 != 0) goto Ld
            return r4
        Ld:
            java.lang.String[] r0 = p249o7.C5066o4.f19923c
            java.lang.String[] r1 = p249o7.C5066o4.f19921a
            java.util.concurrent.atomic.AtomicReference<java.lang.String[]> r2 = p249o7.C4969c3.f19615b
            java.lang.String r4 = m11112g(r4, r0, r1, r2)
            return r4
    }

    /* renamed from: e */
    public final java.lang.String m11117e(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.google.android.gms.measurement.internal.e r0 = r3.f19618a
            boolean r0 = r0.m3181g()
            if (r0 != 0) goto Ld
            return r4
        Ld:
            java.lang.String[] r0 = p249o7.C5074p4.f19938b
            java.lang.String[] r1 = p249o7.C5074p4.f19937a
            java.util.concurrent.atomic.AtomicReference<java.lang.String[]> r2 = p249o7.C4969c3.f19616c
            java.lang.String r4 = m11112g(r4, r0, r1, r2)
            return r4
    }

    /* renamed from: f */
    public final java.lang.String m11118f(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.google.android.gms.measurement.internal.e r0 = r3.f19618a
            boolean r0 = r0.m3181g()
            if (r0 != 0) goto Ld
            return r4
        Ld:
            java.lang.String r0 = "_exp_"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "experiment_id("
            java.lang.String r1 = ")"
            java.lang.String r4 = android.support.v4.media.C0145d.m257a(r0, r4, r1)
            return r4
        L1e:
            java.lang.String[] r0 = p249o7.C5082q4.f19964b
            java.lang.String[] r1 = p249o7.C5082q4.f19963a
            java.util.concurrent.atomic.AtomicReference<java.lang.String[]> r2 = p249o7.C4969c3.f19617d
            java.lang.String r4 = m11112g(r4, r0, r1, r2)
            return r4
    }
}
