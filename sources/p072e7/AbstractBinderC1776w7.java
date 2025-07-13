package p072e7;

/* renamed from: e7.w7 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1776w7 extends p072e7.BinderC1622h implements p072e7.InterfaceC1711p8 {
    public AbstractBinderC1776w7() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.internal.IMediaRouter"
            r1.<init>(r0)
            return
    }

    @Override // p072e7.BinderC1622h
    /* renamed from: v */
    public final boolean mo3764v(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            r3 = this;
            r7 = 0
            r0 = 1
            r1 = 0
            switch(r4) {
                case 1: goto L1b5;
                case 2: goto L17f;
                case 3: goto L150;
                case 4: goto L12f;
                case 5: goto L103;
                case 6: goto Led;
                case 7: goto Lc4;
                case 8: goto L95;
                case 9: goto L82;
                case 10: goto L77;
                case 11: goto L41;
                case 12: goto L15;
                case 13: goto L7;
                default: goto L6;
            }
        L6:
            return r1
        L7:
            int r4 = r5.readInt()
            r5 = r3
            e7.e r5 = (p072e7.BinderC1592e) r5
            f1.o r5 = r5.f7540a
            r5.m5035k(r4)
            goto L1b1
        L15:
            r4 = r3
            e7.e r4 = (p072e7.BinderC1592e) r4
            f1.o r5 = r4.f7540a
            java.util.Objects.requireNonNull(r5)
            p085f1.C1974o.m5025b()
            f1.o$e r5 = p085f1.C1974o.f8670d
            f1.o$i r5 = r5.f8696p
            if (r5 == 0) goto L37
            f1.o r4 = r4.f7540a
            f1.o$i r4 = r4.m5031g()
            java.lang.String r4 = r4.f8735c
            java.lang.String r5 = r5.f8735c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L37
            r1 = 1
        L37:
            r6.writeNoException()
        L3a:
            int r4 = p072e7.C1632i.f7582a
            r6.writeInt(r1)
            goto L200
        L41:
            r4 = r3
            e7.e r4 = (p072e7.BinderC1592e) r4
            java.util.Map<f1.n, java.util.Set<f1.o$b>> r5 = r4.f7541b
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L4e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r5.next()
            java.util.Set r7 = (java.util.Set) r7
            java.util.Iterator r7 = r7.iterator()
        L5e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r7.next()
            f1.o$b r1 = (p085f1.C1974o.b) r1
            f1.o r2 = r4.f7540a
            r2.m5033i(r1)
            goto L5e
        L70:
            java.util.Map<f1.n, java.util.Set<f1.o$b>> r4 = r4.f7541b
            r4.clear()
            goto L1b1
        L77:
            r6.writeNoException()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r6.writeInt(r4)
            goto L200
        L82:
            r4 = r3
            e7.e r4 = (p072e7.BinderC1592e) r4
            f1.o r4 = r4.f7540a
            f1.o$i r4 = r4.m5031g()
            java.lang.String r4 = r4.f8735c
            r6.writeNoException()
            r6.writeString(r4)
            goto L200
        L95:
            java.lang.String r4 = r5.readString()
            r5 = r3
            e7.e r5 = (p072e7.BinderC1592e) r5
            f1.o r5 = r5.f7540a
            java.util.List r5 = r5.m5030f()
            java.util.Iterator r5 = r5.iterator()
        La6:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r5.next()
            f1.o$i r1 = (p085f1.C1974o.i) r1
            java.lang.String r2 = r1.f8735c
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto La6
            android.os.Bundle r7 = r1.f8750r
        Lbc:
            r6.writeNoException()
            p072e7.C1632i.m4226c(r6, r7)
            goto L200
        Lc4:
            r4 = r3
            e7.e r4 = (p072e7.BinderC1592e) r4
            f1.o r5 = r4.f7540a
            java.util.Objects.requireNonNull(r5)
            p085f1.C1974o.m5025b()
            f1.o$e r5 = p085f1.C1974o.f8670d
            f1.o$i r5 = r5.m5041f()
            if (r5 == 0) goto Le8
            f1.o r4 = r4.f7540a
            f1.o$i r4 = r4.m5031g()
            java.lang.String r4 = r4.f8735c
            java.lang.String r5 = r5.f8735c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Le8
            r1 = 1
        Le8:
            r6.writeNoException()
            goto L3a
        Led:
            r4 = r3
            e7.e r4 = (p072e7.BinderC1592e) r4
            f1.o r4 = r4.f7540a
            java.util.Objects.requireNonNull(r4)
            p085f1.C1974o.m5025b()
            f1.o$e r5 = p085f1.C1974o.f8670d
            f1.o$i r5 = r5.m5041f()
            r4.m5034j(r5)
            goto L1b1
        L103:
            java.lang.String r4 = r5.readString()
            r5 = r3
            e7.e r5 = (p072e7.BinderC1592e) r5
            f1.o r7 = r5.f7540a
            java.util.List r7 = r7.m5030f()
            java.util.Iterator r7 = r7.iterator()
        L114:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L1b1
            java.lang.Object r1 = r7.next()
            f1.o$i r1 = (p085f1.C1974o.i) r1
            java.lang.String r2 = r1.f8735c
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L114
            f1.o r4 = r5.f7540a
            r4.m5034j(r1)
            goto L1b1
        L12f:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = p072e7.C1632i.m4224a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            int r5 = r5.readInt()
            r7 = r3
            e7.e r7 = (p072e7.BinderC1592e) r7
            f1.o r7 = r7.f7540a
            f1.n r4 = p085f1.C1973n.m5022b(r4)
            boolean r4 = r7.m5032h(r4, r5)
            r6.writeNoException()
            r6.writeInt(r4)
            goto L200
        L150:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = p072e7.C1632i.m4224a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            r5 = r3
            e7.e r5 = (p072e7.BinderC1592e) r5
            f1.n r4 = p085f1.C1973n.m5022b(r4)
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r7 != r1) goto L16d
            r5.m4183k2(r4)
            goto L1b1
        L16d:
            e7.k r7 = new e7.k
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r7.<init>(r1)
            h6.a0 r1 = new h6.a0
            r1.<init>(r5, r4)
            r7.post(r1)
            goto L1b1
        L17f:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = p072e7.C1632i.m4224a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            int r5 = r5.readInt()
            r7 = r3
            e7.e r7 = (p072e7.BinderC1592e) r7
            f1.n r4 = p085f1.C1973n.m5022b(r4)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r1 != r2) goto L1a0
            r7.m4182H(r4, r5)
            goto L1b1
        L1a0:
            e7.k r1 = new e7.k
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            e7.d r2 = new e7.d
            r2.<init>(r7, r4, r5)
            r1.post(r2)
        L1b1:
            r6.writeNoException()
            goto L200
        L1b5:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = p072e7.C1632i.m4224a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L1c4
            goto L1d6
        L1c4:
            java.lang.String r7 = "com.google.android.gms.cast.framework.internal.IMediaRouterCallback"
            android.os.IInterface r7 = r5.queryLocalInterface(r7)
            boolean r1 = r7 instanceof p072e7.InterfaceC1731r8
            if (r1 == 0) goto L1d1
            e7.r8 r7 = (p072e7.InterfaceC1731r8) r7
            goto L1d6
        L1d1:
            e7.q8 r7 = new e7.q8
            r7.<init>(r5)
        L1d6:
            r5 = r3
            e7.e r5 = (p072e7.BinderC1592e) r5
            f1.n r4 = p085f1.C1973n.m5022b(r4)
            java.util.Map<f1.n, java.util.Set<f1.o$b>> r1 = r5.f7541b
            boolean r1 = r1.containsKey(r4)
            if (r1 != 0) goto L1ef
            java.util.Map<f1.n, java.util.Set<f1.o$b>> r1 = r5.f7541b
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.put(r4, r2)
        L1ef:
            java.util.Map<f1.n, java.util.Set<f1.o$b>> r5 = r5.f7541b
            java.lang.Object r4 = r5.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            e7.a r5 = new e7.a
            r5.<init>(r7)
            r4.add(r5)
            goto L1b1
        L200:
            return r0
    }
}
