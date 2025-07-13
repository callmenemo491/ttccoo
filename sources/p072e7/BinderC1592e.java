package p072e7;

/* renamed from: e7.e */
/* loaded from: classes.dex */
public final class BinderC1592e extends p072e7.AbstractBinderC1776w7 {

    /* renamed from: a */
    public final p085f1.C1974o f7540a;

    /* renamed from: b */
    public final java.util.Map<p085f1.C1973n, java.util.Set<p085f1.C1974o.b>> f7541b;

    /* renamed from: c */
    public p072e7.C1612g f7542c;

    public BinderC1592e(p085f1.C1974o r5, p052d6.C1297b r6) {
            r4 = this;
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.f7541b = r0
            r4.f7540a = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r5 <= r0) goto L75
            boolean r1 = r6.f6826h0
            boolean r6 = r6.f6827i0
            f1.c0$a r2 = new f1.c0$a
            r2.<init>()
            if (r5 < r0) goto L1f
            r2.f8518a = r1
        L1f:
            if (r5 < r0) goto L23
            r2.f8519b = r6
        L23:
            f1.c0 r5 = new f1.c0
            r5.<init>(r2)
            p085f1.C1974o.m5025b()
            f1.o$e r0 = p085f1.C1974o.f8670d
            f1.c0 r2 = r0.f8694n
            r0.f8694n = r5
            boolean r3 = r0.f8682b
            if (r3 == 0) goto L52
            if (r2 != 0) goto L39
            r2 = 0
            goto L3b
        L39:
            boolean r2 = r2.f8516c
        L3b:
            boolean r5 = r5.f8516c
            if (r2 == r5) goto L52
            f1.e r5 = r0.f8683c
            f1.h r0 = r0.f8703w
            r5.f8616c0 = r0
            boolean r0 = r5.f8617d0
            if (r0 != 0) goto L52
            r0 = 1
            r5.f8617d0 = r0
            f1.i$c r5 = r5.f8614a0
            r0 = 2
            r5.sendEmptyMessage(r0)
        L52:
            if (r1 == 0) goto L59
            e7.i2 r5 = p072e7.EnumC1635i2.f7592I0
            p072e7.C1576c3.m4139b(r5)
        L59:
            if (r6 == 0) goto L75
            e7.g r5 = new e7.g
            r5.<init>()
            r4.f7542c = r5
            e7.c r5 = new e7.c
            e7.g r6 = r4.f7542c
            r5.<init>(r6)
            p085f1.C1974o.m5025b()
            f1.o$e r6 = p085f1.C1974o.f8670d
            r6.f8705y = r5
            e7.i2 r5 = p072e7.EnumC1635i2.f7593J0
            p072e7.C1576c3.m4139b(r5)
        L75:
            return
    }

    /* renamed from: H */
    public final void m4182H(p085f1.C1973n r4, int r5) {
            r3 = this;
            java.util.Map<f1.n, java.util.Set<f1.o$b>> r0 = r3.f7541b
            java.lang.Object r0 = r0.get(r4)
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            f1.o$b r1 = (p085f1.C1974o.b) r1
            f1.o r2 = r3.f7540a
            r2.m5027a(r4, r1, r5)
            goto Lc
        L1e:
            return
    }

    /* renamed from: k2 */
    public final void m4183k2(p085f1.C1973n r3) {
            r2 = this;
            java.util.Map<f1.n, java.util.Set<f1.o$b>> r0 = r2.f7541b
            java.lang.Object r3 = r0.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r3.next()
            f1.o$b r0 = (p085f1.C1974o.b) r0
            f1.o r1 = r2.f7540a
            r1.m5033i(r0)
            goto Lc
        L1e:
            return
    }

    /* renamed from: x */
    public final void m4184x(android.support.v4.media.session.MediaSessionCompat r3) {
            r2 = this;
            f1.o r0 = r2.f7540a
            java.util.Objects.requireNonNull(r0)
            boolean r0 = p085f1.C1974o.f8669c
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "addMediaSessionCompat: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MediaRouter"
            android.util.Log.d(r1, r0)
        L1f:
            f1.o$e r0 = p085f1.C1974o.f8670d
            r0.f8678B = r3
            if (r3 == 0) goto L2b
            f1.o$e$d r1 = new f1.o$e$d
            r1.<init>(r0, r3)
            goto L2c
        L2b:
            r1 = 0
        L2c:
            f1.o$e$d r3 = r0.f8677A
            if (r3 == 0) goto L33
            r3.m5057a()
        L33:
            r0.f8677A = r1
            if (r1 == 0) goto L3a
            r0.m5049n()
        L3a:
            return
    }
}
