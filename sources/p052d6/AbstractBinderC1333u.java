package p052d6;

/* renamed from: d6.u */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1333u extends p072e7.BinderC1622h implements p052d6.InterfaceC1334v {
    public AbstractBinderC1333u() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.ISessionManagerListener"
            r1.<init>(r0)
            return
    }

    @Override // p072e7.BinderC1622h
    /* renamed from: v */
    public final boolean mo3764v(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
            r2 = this;
            r6 = 1
            r0 = 0
            switch(r3) {
                case 1: goto L1ac;
                case 2: goto L180;
                case 3: goto L153;
                case 4: goto L126;
                case 5: goto Lfc;
                case 6: goto Lce;
                case 7: goto La0;
                case 8: goto L6d;
                case 9: goto L3f;
                case 10: goto L11;
                case 11: goto L6;
                default: goto L5;
            }
        L5:
            return r0
        L6:
            r5.writeNoException()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r5.writeInt(r3)
            goto L1bc
        L11:
            android.os.IBinder r3 = r4.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            int r4 = r4.readInt()
            r0 = r2
            com.google.android.gms.cast.framework.b r0 = (com.google.android.gms.cast.framework.BinderC1063b) r0
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            java.lang.Class<T extends d6.e> r1 = r0.f5450b
            boolean r1 = r1.isInstance(r3)
            if (r1 == 0) goto L1a8
            d6.g<T extends d6.e> r1 = r0.f5449a
            if (r1 == 0) goto L1a8
            java.lang.Class<T extends d6.e> r0 = r0.f5450b
            java.lang.Object r3 = r0.cast(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            r1.mo2881q(r3, r4)
            goto L1a8
        L3f:
            android.os.IBinder r3 = r4.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            int r4 = r4.readInt()
            r0 = r2
            com.google.android.gms.cast.framework.b r0 = (com.google.android.gms.cast.framework.BinderC1063b) r0
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            java.lang.Class<T extends d6.e> r1 = r0.f5450b
            boolean r1 = r1.isInstance(r3)
            if (r1 == 0) goto L1a8
            d6.g<T extends d6.e> r1 = r0.f5449a
            if (r1 == 0) goto L1a8
            java.lang.Class<T extends d6.e> r0 = r0.f5450b
            java.lang.Object r3 = r0.cast(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            r1.mo2875i(r3, r4)
            goto L1a8
        L6d:
            android.os.IBinder r3 = r4.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            int r1 = p072e7.C1632i.f7582a
            int r4 = r4.readInt()
            if (r4 == 0) goto L7e
            r0 = 1
        L7e:
            r4 = r2
            com.google.android.gms.cast.framework.b r4 = (com.google.android.gms.cast.framework.BinderC1063b) r4
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            java.lang.Class<T extends d6.e> r1 = r4.f5450b
            boolean r1 = r1.isInstance(r3)
            if (r1 == 0) goto L1a8
            d6.g<T extends d6.e> r1 = r4.f5449a
            if (r1 == 0) goto L1a8
            java.lang.Class<T extends d6.e> r4 = r4.f5450b
            java.lang.Object r3 = r4.cast(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            r1.mo2882r(r3, r0)
            goto L1a8
        La0:
            android.os.IBinder r3 = r4.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            java.lang.String r4 = r4.readString()
            r0 = r2
            com.google.android.gms.cast.framework.b r0 = (com.google.android.gms.cast.framework.BinderC1063b) r0
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            java.lang.Class<T extends d6.e> r1 = r0.f5450b
            boolean r1 = r1.isInstance(r3)
            if (r1 == 0) goto L1a8
            d6.g<T extends d6.e> r1 = r0.f5449a
            if (r1 == 0) goto L1a8
            java.lang.Class<T extends d6.e> r0 = r0.f5450b
            java.lang.Object r3 = r0.cast(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            r1.mo2874h(r3, r4)
            goto L1a8
        Lce:
            android.os.IBinder r3 = r4.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            int r4 = r4.readInt()
            r0 = r2
            com.google.android.gms.cast.framework.b r0 = (com.google.android.gms.cast.framework.BinderC1063b) r0
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            java.lang.Class<T extends d6.e> r1 = r0.f5450b
            boolean r1 = r1.isInstance(r3)
            if (r1 == 0) goto L1a8
            d6.g<T extends d6.e> r1 = r0.f5449a
            if (r1 == 0) goto L1a8
            java.lang.Class<T extends d6.e> r0 = r0.f5450b
            java.lang.Object r3 = r0.cast(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            r1.mo2867a(r3, r4)
            goto L1a8
        Lfc:
            android.os.IBinder r3 = r4.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            r4 = r2
            com.google.android.gms.cast.framework.b r4 = (com.google.android.gms.cast.framework.BinderC1063b) r4
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            java.lang.Class<T extends d6.e> r0 = r4.f5450b
            boolean r0 = r0.isInstance(r3)
            if (r0 == 0) goto L1a8
            d6.g<T extends d6.e> r0 = r4.f5449a
            if (r0 == 0) goto L1a8
            java.lang.Class<T extends d6.e> r4 = r4.f5450b
            java.lang.Object r3 = r4.cast(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            r0.mo2877k(r3)
            goto L1a8
        L126:
            android.os.IBinder r3 = r4.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            int r4 = r4.readInt()
            r0 = r2
            com.google.android.gms.cast.framework.b r0 = (com.google.android.gms.cast.framework.BinderC1063b) r0
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            java.lang.Class<T extends d6.e> r1 = r0.f5450b
            boolean r1 = r1.isInstance(r3)
            if (r1 == 0) goto L1a8
            d6.g<T extends d6.e> r1 = r0.f5449a
            if (r1 == 0) goto L1a8
            java.lang.Class<T extends d6.e> r0 = r0.f5450b
            java.lang.Object r3 = r0.cast(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            r1.mo2876j(r3, r4)
            goto L1a8
        L153:
            android.os.IBinder r3 = r4.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            java.lang.String r4 = r4.readString()
            r0 = r2
            com.google.android.gms.cast.framework.b r0 = (com.google.android.gms.cast.framework.BinderC1063b) r0
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            java.lang.Class<T extends d6.e> r1 = r0.f5450b
            boolean r1 = r1.isInstance(r3)
            if (r1 == 0) goto L1a8
            d6.g<T extends d6.e> r1 = r0.f5449a
            if (r1 == 0) goto L1a8
            java.lang.Class<T extends d6.e> r0 = r0.f5450b
            java.lang.Object r3 = r0.cast(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            r1.mo2880n(r3, r4)
            goto L1a8
        L180:
            android.os.IBinder r3 = r4.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            r4 = r2
            com.google.android.gms.cast.framework.b r4 = (com.google.android.gms.cast.framework.BinderC1063b) r4
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            java.lang.Class<T extends d6.e> r0 = r4.f5450b
            boolean r0 = r0.isInstance(r3)
            if (r0 == 0) goto L1a8
            d6.g<T extends d6.e> r0 = r4.f5449a
            if (r0 == 0) goto L1a8
            java.lang.Class<T extends d6.e> r4 = r4.f5450b
            java.lang.Object r3 = r4.cast(r3)
            d6.e r3 = (p052d6.AbstractC1303e) r3
            r0.mo2872f(r3)
        L1a8:
            r5.writeNoException()
            goto L1bc
        L1ac:
            r3 = r2
            com.google.android.gms.cast.framework.b r3 = (com.google.android.gms.cast.framework.BinderC1063b) r3
            d6.g<T extends d6.e> r3 = r3.f5449a
            x6.b r4 = new x6.b
            r4.<init>(r3)
            r5.writeNoException()
            p072e7.C1632i.m4227d(r5, r4)
        L1bc:
            return r6
    }
}
