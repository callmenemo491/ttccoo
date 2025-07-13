package p249o7;

/* renamed from: o7.r */
/* loaded from: classes.dex */
public final class C5085r implements android.os.Parcelable.Creator<p249o7.C5077q> {
    public C5085r() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static void m11415a(p249o7.C5077q r4, android.os.Parcel r5, int r6) {
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 2
            java.lang.String r2 = r4.f19951Y
            r3 = 0
            p270p6.C5369c.m11719g(r5, r1, r2, r3)
            r1 = 3
            o7.o r2 = r4.f19952Z
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            r6 = 4
            java.lang.String r1 = r4.f19953a0
            p270p6.C5369c.m11719g(r5, r6, r1, r3)
            r6 = 5
            long r1 = r4.f19954b0
            r4 = 8
            p270p6.C5369c.m11724l(r5, r6, r4)
            r5.writeLong(r1)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p249o7.C5077q createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = p270p6.C5368b.m11710t(r11)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r2
        Lb:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L45
            int r1 = r11.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 2
            if (r2 == r3) goto L3f
            r3 = 3
            if (r2 == r3) goto L35
            r3 = 4
            if (r2 == r3) goto L2f
            r3 = 5
            if (r2 == r3) goto L29
            p270p6.C5368b.m11709s(r11, r1)
            goto Lb
        L29:
            long r1 = p270p6.C5368b.m11706p(r11, r1)
            r8 = r1
            goto Lb
        L2f:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r7 = r1
            goto Lb
        L35:
            android.os.Parcelable$Creator<o7.o> r2 = p249o7.C5061o.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r11, r1, r2)
            o7.o r1 = (p249o7.C5061o) r1
            r6 = r1
            goto Lb
        L3f:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r5 = r1
            goto Lb
        L45:
            p270p6.C5368b.m11699i(r11, r0)
            o7.q r11 = new o7.q
            r4 = r11
            r4.<init>(r5, r6, r7, r8)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p249o7.C5077q[] newArray(int r1) {
            r0 = this;
            o7.q[] r1 = new p249o7.C5077q[r1]
            return r1
    }
}
