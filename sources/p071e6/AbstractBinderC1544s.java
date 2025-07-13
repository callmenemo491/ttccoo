package p071e6;

/* renamed from: e6.s */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1544s extends p072e7.BinderC1622h implements p071e6.InterfaceC1545t {
    public AbstractBinderC1544s() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.media.IImagePicker"
            r1.<init>(r0)
            return
    }

    @Override // p072e7.BinderC1622h
    /* renamed from: v */
    public final boolean mo3764v(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L49
            r0 = 2
            if (r2 == r0) goto L38
            r0 = 3
            if (r2 == r0) goto L2e
            r0 = 4
            if (r2 == r0) goto Le
            r2 = 0
            return r2
        Le:
            android.os.Parcelable$Creator<c6.k> r2 = p036c6.C0893k.CREATOR
            android.os.Parcelable r2 = p072e7.C1632i.m4224a(r3, r2)
            c6.k r2 = (p036c6.C0893k) r2
            android.os.Parcelable$Creator<e6.b> r0 = p071e6.C1523b.CREATOR
            android.os.Parcelable r3 = p072e7.C1632i.m4224a(r3, r0)
            e6.b r3 = (p071e6.C1523b) r3
            r0 = r1
            e6.x r0 = (p071e6.BinderC1549x) r0
            e6.c r0 = r0.f7469a
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r3)
            n6.a r2 = r0.m4106a(r2)
            goto L5d
        L2e:
            r4.writeNoException()
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r4.writeInt(r2)
            goto L63
        L38:
            r2 = r1
            e6.x r2 = (p071e6.BinderC1549x) r2
            e6.c r2 = r2.f7469a
            x6.b r3 = new x6.b
            r3.<init>(r2)
            r4.writeNoException()
            p072e7.C1632i.m4227d(r4, r3)
            goto L63
        L49:
            android.os.Parcelable$Creator<c6.k> r2 = p036c6.C0893k.CREATOR
            android.os.Parcelable r2 = p072e7.C1632i.m4224a(r3, r2)
            c6.k r2 = (p036c6.C0893k) r2
            r3.readInt()
            r3 = r1
            e6.x r3 = (p071e6.BinderC1549x) r3
            e6.c r3 = r3.f7469a
            n6.a r2 = r3.m4106a(r2)
        L5d:
            r4.writeNoException()
            p072e7.C1632i.m4226c(r4, r2)
        L63:
            return r5
    }
}
