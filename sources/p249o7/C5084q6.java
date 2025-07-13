package p249o7;

/* renamed from: o7.q6 */
/* loaded from: classes.dex */
public final class C5084q6 implements android.os.Parcelable.Creator<p249o7.C5076p6> {
    public C5084q6() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static void m11414a(p249o7.C5076p6 r6, android.os.Parcel r7, int r8) {
            r8 = 20293(0x4f45, float:2.8437E-41)
            int r8 = p270p6.C5369c.m11723k(r7, r8)
            r0 = 1
            int r1 = r6.f19944Y
            r2 = 4
            p270p6.C5369c.m11724l(r7, r0, r2)
            r7.writeInt(r1)
            r0 = 2
            java.lang.String r1 = r6.f19945Z
            r3 = 0
            p270p6.C5369c.m11719g(r7, r0, r1, r3)
            r0 = 3
            long r4 = r6.f19946a0
            r1 = 8
            p270p6.C5369c.m11724l(r7, r0, r1)
            r7.writeLong(r4)
            java.lang.Long r0 = r6.f19947b0
            p270p6.C5369c.m11717e(r7, r2, r0, r3)
            r0 = 6
            java.lang.String r2 = r6.f19948c0
            p270p6.C5369c.m11719g(r7, r0, r2, r3)
            r0 = 7
            java.lang.String r2 = r6.f19949d0
            p270p6.C5369c.m11719g(r7, r0, r2, r3)
            java.lang.Double r6 = r6.f19950e0
            if (r6 != 0) goto L38
            goto L42
        L38:
            p270p6.C5369c.m11724l(r7, r1, r1)
            double r0 = r6.doubleValue()
            r7.writeDouble(r0)
        L42:
            p270p6.C5369c.m11726n(r7, r8)
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p249o7.C5076p6 createFromParcel(android.os.Parcel r17) {
            r16 = this;
            r0 = r17
            int r1 = p270p6.C5368b.m11710t(r17)
            r2 = 0
            r3 = 0
            r4 = 0
            r8 = r2
            r11 = r8
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r9 = r4
            r7 = 0
        L12:
            int r3 = r17.dataPosition()
            if (r3 >= r1) goto L74
            int r3 = r17.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r3
            switch(r4) {
                case 1: goto L6e;
                case 2: goto L69;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L48;
                case 6: goto L43;
                case 7: goto L3e;
                case 8: goto L27;
                default: goto L23;
            }
        L23:
            p270p6.C5368b.m11709s(r0, r3)
            goto L12
        L27:
            int r3 = p270p6.C5368b.m11708r(r0, r3)
            if (r3 != 0) goto L2f
            r15 = r2
            goto L12
        L2f:
            r4 = 8
            p270p6.C5368b.m11712v(r0, r3, r4)
            double r3 = r17.readDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r15 = r3
            goto L12
        L3e:
            java.lang.String r14 = p270p6.C5368b.m11695e(r0, r3)
            goto L12
        L43:
            java.lang.String r13 = p270p6.C5368b.m11695e(r0, r3)
            goto L12
        L48:
            int r3 = p270p6.C5368b.m11708r(r0, r3)
            if (r3 != 0) goto L50
            r12 = r2
            goto L12
        L50:
            r4 = 4
            p270p6.C5368b.m11712v(r0, r3, r4)
            float r3 = r17.readFloat()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r12 = r3
            goto L12
        L5e:
            java.lang.Long r11 = p270p6.C5368b.m11707q(r0, r3)
            goto L12
        L63:
            long r3 = p270p6.C5368b.m11706p(r0, r3)
            r9 = r3
            goto L12
        L69:
            java.lang.String r8 = p270p6.C5368b.m11695e(r0, r3)
            goto L12
        L6e:
            int r3 = p270p6.C5368b.m11705o(r0, r3)
            r7 = r3
            goto L12
        L74:
            p270p6.C5368b.m11699i(r0, r1)
            o7.p6 r0 = new o7.p6
            r6 = r0
            r6.<init>(r7, r8, r9, r11, r12, r13, r14, r15)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p249o7.C5076p6[] newArray(int r1) {
            r0 = this;
            o7.p6[] r1 = new p249o7.C5076p6[r1]
            return r1
    }
}
