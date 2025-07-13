package p052d6;

/* renamed from: d6.k0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1316k0 extends p072e7.BinderC1622h implements p052d6.InterfaceC1318l0 {
    public AbstractBinderC1316k0() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.ICastConnectionController"
            r1.<init>(r0)
            return
    }

    @Override // p072e7.BinderC1622h
    /* renamed from: v */
    public final boolean mo3764v(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
            r5 = this;
            r9 = 0
            r0 = 1
            if (r6 == r0) goto L8e
            r1 = 2
            if (r6 == r1) goto L50
            r1 = 3
            if (r6 == r1) goto L2a
            r1 = 4
            if (r6 == r1) goto L1c
            r7 = 5
            if (r6 == r7) goto L11
            return r9
        L11:
            r8.writeNoException()
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r8.writeInt(r6)
            goto Lca
        L1c:
            int r6 = r7.readInt()
            r7 = r5
            d6.e0 r7 = (p052d6.BinderC1304e0) r7
            com.google.android.gms.cast.framework.a r7 = r7.f6835a
            com.google.android.gms.cast.framework.C1062a.m2969l(r7, r6)
            goto Lc7
        L2a:
            java.lang.String r6 = r7.readString()
            r7 = r5
            d6.e0 r7 = (p052d6.BinderC1304e0) r7
            com.google.android.gms.cast.framework.a r7 = r7.f6835a
            com.google.android.gms.cast.e r7 = r7.f5444h
            if (r7 == 0) goto Lc7
            m6.k$a r9 = p218m6.AbstractC4398k.m9834a()
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x
            com.google.android.gms.cast.d r7 = (com.google.android.gms.cast.C1060d) r7
            r1.<init>(r7, r6)
            r9.f17961a = r1
            r6 = 8409(0x20d9, float:1.1784E-41)
            r9.f17964d = r6
            m6.k r6 = r9.m9835a()
            r7.m9328d(r0, r6)
            goto Lc7
        L50:
            java.lang.String r6 = r7.readString()
            android.os.Parcelable$Creator<c6.h> r9 = p036c6.C0887h.CREATOR
            android.os.Parcelable r7 = p072e7.C1632i.m4224a(r7, r9)
            c6.h r7 = (p036c6.C0887h) r7
            r9 = r5
            d6.e0 r9 = (p052d6.BinderC1304e0) r9
            com.google.android.gms.cast.framework.a r1 = r9.f6835a
            com.google.android.gms.cast.e r1 = r1.f5444h
            if (r1 == 0) goto Lc7
            m6.k$a r2 = p218m6.AbstractC4398k.m9834a()
            androidx.fragment.app.l0 r3 = new androidx.fragment.app.l0
            com.google.android.gms.cast.d r1 = (com.google.android.gms.cast.C1060d) r1
            r3.<init>(r1, r6, r7)
            r2.f17961a = r3
            r6 = 8406(0x20d6, float:1.178E-41)
            r2.f17964d = r6
            m6.k r6 = r2.m9835a()
            s7.i r6 = r1.m9328d(r0, r6)
            d6.d0 r7 = new d6.d0
            r7.<init>(r9, r0)
            s7.q r6 = (p327s7.C5993q) r6
            java.util.Objects.requireNonNull(r6)
            java.util.concurrent.Executor r9 = p327s7.C5987k.f23076a
            r6.m12471p(r9, r7)
            goto Lc7
        L8e:
            java.lang.String r6 = r7.readString()
            java.lang.String r7 = r7.readString()
            r1 = r5
            d6.e0 r1 = (p052d6.BinderC1304e0) r1
            com.google.android.gms.cast.framework.a r2 = r1.f6835a
            com.google.android.gms.cast.e r2 = r2.f5444h
            if (r2 == 0) goto Lc7
            m6.k$a r3 = p218m6.AbstractC4398k.m9834a()
            c6.f0 r4 = new c6.f0
            com.google.android.gms.cast.d r2 = (com.google.android.gms.cast.C1060d) r2
            r4.<init>(r2, r6, r7, r9)
            r3.f17961a = r4
            r6 = 8407(0x20d7, float:1.1781E-41)
            r3.f17964d = r6
            m6.k r6 = r3.m9835a()
            s7.i r6 = r2.m9328d(r0, r6)
            d6.d0 r7 = new d6.d0
            r7.<init>(r1, r9)
            s7.q r6 = (p327s7.C5993q) r6
            java.util.Objects.requireNonNull(r6)
            java.util.concurrent.Executor r9 = p327s7.C5987k.f23076a
            r6.m12471p(r9, r7)
        Lc7:
            r8.writeNoException()
        Lca:
            return r0
    }
}
